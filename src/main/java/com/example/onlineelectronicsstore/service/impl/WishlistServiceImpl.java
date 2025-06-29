package com.example.onlineelectronicsstore.service.impl;

import com.example.onlineelectronicsstore.model.Wishlist;
import com.example.onlineelectronicsstore.repository.WishlistRepository;
import com.example.onlineelectronicsstore.service.WishlistService;
import java.util.List;
import java.util.Optional;

public class WishlistServiceImpl implements WishlistService {
    private final WishlistRepository wishlistRepository;

    public WishlistServiceImpl(WishlistRepository wishlistRepository) {
        this.wishlistRepository = wishlistRepository;
    }

    @Override
    public Wishlist save(Wishlist wishlist) {
        if (wishlist.getUserId() == null || wishlist.getProductId() == null) {
            throw new IllegalArgumentException("Wishlist must have userId and productId");
        }
        return wishlistRepository.save(wishlist);
    }

    @Override
    public Optional<Wishlist> findById(Long id) {
        return wishlistRepository.findById(id);
    }

    @Override
    public List<Wishlist> findAll() {
        return wishlistRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        wishlistRepository.deleteById(id);
    }
}