package com.example.onlineelectronicsstore.service.impl;

import com.example.onlineelectronicsstore.model.Review;
import com.example.onlineelectronicsstore.repository.ReviewRepository;
import com.example.onlineelectronicsstore.service.ReviewService;
import java.util.List;
import java.util.Optional;

public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review save(Review review) {
        if (review.getRating() < 1 || review.getRating() > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
        return reviewRepository.save(review);
    }

    @Override
    public Optional<Review> findById(Long id) {
        return reviewRepository.findById(id);
    }

    @Override
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        reviewRepository.deleteById(id);
    }
}