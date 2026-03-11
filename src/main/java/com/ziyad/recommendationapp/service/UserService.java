package com.ziyad.recommendationapp.service;

import com.ziyad.recommendationapp.model.User;
import com.ziyad.recommendationapp.repository.UserRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepo;
    private final PasswordEncoder encoder;

    public UserService(UserRepository userRepo, PasswordEncoder encoder) {
        this.userRepo = userRepo;
        this.encoder = encoder;
    }

    public User register(String email, String rawPassword) {
        if (userRepo.existsByEmail(email)) {
            throw new IllegalArgumentException("Email already exists");
        }
        User u = new User(email, encoder.encode(rawPassword));
        return userRepo.save(u);
    }

    public User findByEmail(String email) {
        return userRepo.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u = userRepo.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new org.springframework.security.core.userdetails.User(
                u.getEmail(),
                u.getPasswordHash(),
                List.of(new SimpleGrantedAuthority("ROLE_USER"))
        );
    }
}
