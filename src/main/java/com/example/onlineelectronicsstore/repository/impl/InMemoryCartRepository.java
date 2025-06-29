package com.example.onlineelectronicsstore.repository.impl;

import com.example.onlineelectronicsstore.model.Cart;
import com.example.onlineelectronicsstore.repository.CartRepository;
import java.util.*;

public class InMemoryCartRepository implements CartRepository {
    private final Map<Long, Cart> carts = new HashMap<>();
    private long nextId = 1;

    @Override
    public Cart save(Cart cart) {
        if (cart.getCartId() == null) {
            cart.setCartId(nextId++);
        }
        carts.put(cart.getCartId(), cart);
        return cart;
    }

    @Override
    public Optional<Cart> findById(Long id) {
        return Optional.ofNullable(carts.get(id));
    }

    @Override
    public List<Cart> findAll() {
        return new ArrayList<>(carts.values());
    }

    @Override
    public void deleteById(Long id) {
        carts.remove(id);
    }
}