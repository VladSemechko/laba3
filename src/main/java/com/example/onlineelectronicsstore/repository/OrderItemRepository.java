package com.example.onlineelectronicsstore.repository;

import com.example.onlineelectronicsstore.model.OrderItem;
import java.util.List;
import java.util.Optional;

public interface OrderItemRepository {
    OrderItem save(OrderItem orderItem);
    Optional<OrderItem> findById(Long id);
    List<OrderItem> findAll();
    void deleteById(Long id);
}