package com.example.onlineelectronicsstore.service;

import com.example.onlineelectronicsstore.model.Order;
import java.util.List;
import java.util.Optional;

public interface OrderService {
    Order save(Order order);
    Optional<Order> findById(Long id);
    List<Order> findAll();
    void deleteById(Long id);
}