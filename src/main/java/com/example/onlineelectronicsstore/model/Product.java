package com.example.onlineelectronicsstore.model;

public class Product {
    private Long productId;
    private String name;
    private double price;
    private Long categoryId;
    private int stockQuantity;

    // Конструкторы
    public Product() {}

    public Product(Long productId, String name, double price, Long categoryId, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
        this.stockQuantity = stockQuantity;
    }

    // Геттеры и сеттеры
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return String.format(
                "Товар [ID=%d, Название='%s', Цена=%.2f руб., Остаток=%d шт.]",
                productId,
                name,
                price,
                stockQuantity
        );
    }
}