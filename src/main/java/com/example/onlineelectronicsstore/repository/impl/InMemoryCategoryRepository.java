package com.example.onlineelectronicsstore.repository.impl;

import com.example.onlineelectronicsstore.model.Category;
import com.example.onlineelectronicsstore.repository.CategoryRepository;
import java.util.*;

public class InMemoryCategoryRepository implements CategoryRepository {
    private final Map<Long, Category> categories = new HashMap<>();
    private long nextId = 1;

    @Override
    public Category save(Category category) {
        if (category.getCategoryId() == null) {
            category.setCategoryId(nextId++);
        }
        categories.put(category.getCategoryId(), category);
        return category;
    }

    @Override
    public Optional<Category> findById(Long id) {
        return Optional.ofNullable(categories.get(id));
    }

    @Override
    public List<Category> findAll() {
        return new ArrayList<>(categories.values());
    }

    @Override
    public void deleteById(Long id) {
        categories.remove(id);
    }
}