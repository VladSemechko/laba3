package com.example.onlineelectronicsstore.service;

import com.example.onlineelectronicsstore.model.Wishlist;
import java.util.List;
import java.util.Optional;

public interface WishlistService {
    Wishlist save(Wishlist wishlist);
    Optional<Wishlist> findById(Long id);
    List<Wishlist> findAll();
    void deleteById(Long id);
}