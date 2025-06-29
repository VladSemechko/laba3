package com.example.onlineelectronicsstore.model;

import java.time.LocalDateTime;

public class Order {
    private Long orderId;
    private Long userId;
    private LocalDateTime orderDate;
    private String status;
    private double totalAmount;
    private String shippingAddress;
    private String paymentMethod;

    // Конструкторы
    public Order() {}

    public Order(Long orderId, Long userId, LocalDateTime orderDate, String status,
                 double totalAmount, String shippingAddress, String paymentMethod) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderDate = orderDate;
        this.status = status;
        this.totalAmount = totalAmount;
        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
    }

    // Геттеры и сеттеры
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return String.format(
                "Заказ [ID=%d, Пользователь ID=%d, Сумма=%.2f руб., Статус='%s', Адрес='%s']",
                orderId,
                userId,
                totalAmount,
                status,
                shippingAddress
        );
    }
}