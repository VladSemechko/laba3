package com.example.onlineelectronicsstore.service;

import com.example.onlineelectronicsstore.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    void deleteById(Long id);
    Optional<User> findByEmail(String email);
}