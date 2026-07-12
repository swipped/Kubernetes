package com.example.web_server.model;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    // Getteri su neophodni za Thymeleaf
    public String getName() { return name; }
    public String getEmail() { return email; }
}