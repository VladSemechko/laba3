package com.example.onlineelectronicsstore.repository;

import com.example.onlineelectronicsstore.model.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    void deleteById(Long id);
    Optional<User> findByEmail(String email); // Для проверки уникальности email
}