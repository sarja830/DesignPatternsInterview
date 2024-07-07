package com.example;

public class Account {
    private String userName;
    private String password;
    private String email;
    private Role role;
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Account(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
}
