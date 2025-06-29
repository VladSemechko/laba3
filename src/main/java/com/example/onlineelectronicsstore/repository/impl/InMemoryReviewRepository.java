package com.example.onlineelectronicsstore.repository.impl;

import com.example.onlineelectronicsstore.model.Review;
import com.example.onlineelectronicsstore.repository.ReviewRepository;
import java.util.*;

public class InMemoryReviewRepository implements ReviewRepository {
    private final Map<Long, Review> reviews = new HashMap<>();
    private long nextId = 1;

    @Override
    public Review save(Review review) {
        if (review.getReviewId() == null) {
            review.setReviewId(nextId++);
        }
        reviews.put(review.getReviewId(), review);
        return review;
    }

    @Override
    public Optional<Review> findById(Long id) {
        return Optional.ofNullable(reviews.get(id));
    }

    @Override
    public List<Review> findAll() {
        return new ArrayList<>(reviews.values());
    }

    @Override
    public void deleteById(Long id) {
        reviews.remove(id);
    }
}