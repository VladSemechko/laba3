package com.example.onlineelectronicsstore.repository.impl;

import com.example.onlineelectronicsstore.model.Wishlist;
import com.example.onlineelectronicsstore.repository.WishlistRepository;
import java.util.*;

public class InMemoryWishlistRepository implements WishlistRepository {
    private final Map<Long, Wishlist> wishlists = new HashMap<>();
    private long nextId = 1;

    @Override
    public Wishlist save(Wishlist wishlist) {
        if (wishlist.getWishlistId() == null) {
            wishlist.setWishlistId(nextId++);
        }
        wishlists.put(wishlist.getWishlistId(), wishlist);
        return wishlist;
    }

    @Override
    public Optional<Wishlist> findById(Long id) {
        return Optional.ofNullable(wishlists.get(id));
    }

    @Override
    public List<Wishlist> findAll() {
        return new ArrayList<>(wishlists.values());
    }

    @Override
    public void deleteById(Long id) {
        wishlists.remove(id);
    }
}