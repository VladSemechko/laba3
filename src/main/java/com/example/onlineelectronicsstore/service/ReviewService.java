package com.example.onlineelectronicsstore.service;

import com.example.onlineelectronicsstore.model.Review;
import java.util.List;
import java.util.Optional;

public interface ReviewService {
    Review save(Review review);
    Optional<Review> findById(Long id);
    List<Review> findAll();
    void deleteById(Long id);
}