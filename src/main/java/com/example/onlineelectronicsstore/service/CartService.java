package com.example.onlineelectronicsstore.service;

import com.example.onlineelectronicsstore.model.Cart;
import java.util.List;
import java.util.Optional;

public interface CartService {
    Cart save(Cart cart);
    Optional<Cart> findById(Long id);
    List<Cart> findAll();
    void deleteById(Long id);
}