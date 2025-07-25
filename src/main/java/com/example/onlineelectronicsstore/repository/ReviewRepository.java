package com.example.onlineelectronicsstore.repository;

import com.example.onlineelectronicsstore.model.Review;
import java.util.List;
import java.util.Optional;

public interface ReviewRepository {
    Review save(Review review);
    Optional<Review> findById(Long id);
    List<Review> findAll();
    void deleteById(Long id);
}