package com.example.onlineelectronicsstore.repository.impl;

import com.example.onlineelectronicsstore.model.Order;
import com.example.onlineelectronicsstore.repository.OrderRepository;
import java.util.*;

public class InMemoryOrderRepository implements OrderRepository {
    private final Map<Long, Order> orders = new HashMap<>();
    private long nextId = 1;

    @Override
    public Order save(Order order) {
        if (order.getOrderId() == null) {
            order.setOrderId(nextId++);
        }
        orders.put(order.getOrderId(), order);
        return order;
    }

    @Override
    public Optional<Order> findById(Long id) {
        return Optional.ofNullable(orders.get(id));
    }

    @Override
    public List<Order> findAll() {
        return new ArrayList<>(orders.values());
    }

    @Override
    public void deleteById(Long id) {
        orders.remove(id);
    }
}