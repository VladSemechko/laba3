package com.example.onlineelectronicsstore.service.impl;

import com.example.onlineelectronicsstore.model.OrderItem;
import com.example.onlineelectronicsstore.repository.OrderItemRepository;
import com.example.onlineelectronicsstore.service.OrderItemService;
import java.util.List;
import java.util.Optional;

public class OrderItemServiceImpl implements OrderItemService {
    private final OrderItemRepository orderItemRepository;

    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public OrderItem save(OrderItem orderItem) {
        if (orderItem.getOrderId() == null || orderItem.getProductId() == null) {
            throw new IllegalArgumentException("OrderItem must have orderId and productId");
        }
        return orderItemRepository.save(orderItem);
    }

    @Override
    public Optional<OrderItem> findById(Long id) {
        return orderItemRepository.findById(id);
    }

    @Override
    public List<OrderItem> findAll() {
        return orderItemRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        orderItemRepository.deleteById(id);
    }
}