package com.example.onlineelectronicsstore.service.impl;

import com.example.onlineelectronicsstore.model.Cart;
import com.example.onlineelectronicsstore.repository.CartRepository;
import com.example.onlineelectronicsstore.service.CartService;
import java.util.List;
import java.util.Optional;

public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;

    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart save(Cart cart) {
        if (cart.getUserId() == null || cart.getProductId() == null) {
            throw new IllegalArgumentException("Cart must have userId and productId");
        }
        return cartRepository.save(cart);
    }

    @Override
    public Optional<Cart> findById(Long id) {
        return cartRepository.findById(id);
    }

    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        cartRepository.deleteById(id);
    }
}