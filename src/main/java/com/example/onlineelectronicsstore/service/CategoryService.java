package com.example.onlineelectronicsstore.service;

import com.example.onlineelectronicsstore.model.Category;
import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Category save(Category category);
    Optional<Category> findById(Long id);
    List<Category> findAll();
    void deleteById(Long id);
}