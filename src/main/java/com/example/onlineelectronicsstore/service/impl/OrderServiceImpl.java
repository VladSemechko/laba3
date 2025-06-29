package com.example.onlineelectronicsstore.service.impl;

import com.example.onlineelectronicsstore.model.Order;
import com.example.onlineelectronicsstore.repository.OrderRepository;
import com.example.onlineelectronicsstore.service.OrderService;
import java.util.List;
import java.util.Optional;

public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order save(Order order) {
        if (order.getUserId() == null) {
            throw new IllegalArgumentException("Order must have a user ID");
        }
        return orderRepository.save(order);
    }

    @Override
    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }
}