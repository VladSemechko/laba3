package com.example.onlineelectronicsstore.repository.impl;

import com.example.onlineelectronicsstore.model.OrderItem;
import com.example.onlineelectronicsstore.repository.OrderItemRepository;
import java.util.*;

public class InMemoryOrderItemRepository implements OrderItemRepository {
    private final Map<Long, OrderItem> orderItems = new HashMap<>();
    private long nextId = 1;

    @Override
    public OrderItem save(OrderItem orderItem) {
        if (orderItem.getOrderItemId() == null) {
            orderItem.setOrderItemId(nextId++);
        }
        orderItems.put(orderItem.getOrderItemId(), orderItem);
        return orderItem;
    }

    @Override
    public Optional<OrderItem> findById(Long id) {
        return Optional.ofNullable(orderItems.get(id));
    }

    @Override
    public List<OrderItem> findAll() {
        return new ArrayList<>(orderItems.values());
    }

    @Override
    public void deleteById(Long id) {
        orderItems.remove(id);
    }
}