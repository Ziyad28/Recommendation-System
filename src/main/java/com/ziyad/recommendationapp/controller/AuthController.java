package com.ziyad.recommendationapp.controller;

import com.ziyad.recommendationapp.dto.*;
import com.ziyad.recommendationapp.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;
    private final AuthenticationManager authManager;

    public AuthController(UserService userService, AuthenticationManager authManager) {
        this.userService = userService;
        this.authManager = authManager;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@Valid @RequestBody RegisterRequest req) {
        userService.register(req.getEmail(), req.getPassword());
        return ResponseEntity.ok(new AuthResponse("registered", req.getEmail()));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody LoginRequest req, HttpServletRequest request) {
        Authentication auth = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(req.getEmail(), req.getPassword())
        );

        SecurityContextHolder.getContext().setAuthentication(auth);

        HttpSession session = request.getSession(true);
        session.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY,
                SecurityContextHolder.getContext());

        return ResponseEntity.ok(new AuthResponse("logged_in", req.getEmail()));
    }

    @GetMapping("/me")
    public ResponseEntity<?> me() {
        Authentication a = SecurityContextHolder.getContext().getAuthentication();
        if (a == null || !a.isAuthenticated() || "anonymousUser".equals(a.getPrincipal())) {
            return ResponseEntity.status(401).body(Map.of("status", "unauthenticated"));
        }
        return ResponseEntity.ok(Map.of("status", "ok", "email", a.getName()));
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(HttpServletRequest request) {
        SecurityContextHolder.clearContext();
        HttpSession session = request.getSession(false);
        if (session != null) session.invalidate();
        return ResponseEntity.ok(Map.of("status", "logged_out"));
    }
}
