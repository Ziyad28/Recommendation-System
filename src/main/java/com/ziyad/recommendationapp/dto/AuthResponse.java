package com.ziyad.recommendationapp.dto;

public class AuthResponse {
    private String status;
    private String email;

    public AuthResponse() {}
    public AuthResponse(String status, String email) {
        this.status = status;
        this.email = email;
    }

    public String getStatus() { return status; }
    public String getEmail() { return email; }

    public void setStatus(String status) { this.status = status; }
    public void setEmail(String email) { this.email = email; }
}
