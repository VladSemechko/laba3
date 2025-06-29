package com.example.onlineelectronicsstore.repository;

import com.example.onlineelectronicsstore.model.Wishlist;
import java.util.List;
import java.util.Optional;

public interface WishlistRepository {
    Wishlist save(Wishlist wishlist);
    Optional<Wishlist> findById(Long id);
    List<Wishlist> findAll();
    void deleteById(Long id);
}