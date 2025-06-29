package com.example.onlineelectronicsstore.model;

public class User {
    private Long userId;
    private String username;
    private String email;
    private String password;
    private String phone;

    // Конструкторы
    public User() {}

    public User(Long userId, String username, String email, String password, String phone) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    // Геттеры и сеттеры
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format(
                "Пользователь [ID=%d, Логин='%s', Email='%s', Телефон=%s]",
                userId,
                username,
                email,
                phone != null ? "'" + phone + "'" : "не указан"
        );
    }
}