package com.example.onlineelectronicsstore.model;

public class Wishlist {
    private Long wishlistId;
    private Long userId;
    private Long productId;

    // Конструкторы
    public Wishlist() {}

    public Wishlist(Long wishlistId, Long userId, Long productId) {
        this.wishlistId = wishlistId;
        this.userId = userId;
        this.productId = productId;
    }

    // Геттеры и сеттеры
    public Long getWishlistId() {
        return wishlistId;
    }

    public void setWishlistId(Long wishlistId) {
        this.wishlistId = wishlistId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Wishlist{" +
                "wishlistId=" + wishlistId +
                ", userId=" + userId +
                ", productId=" + productId +
                '}';
    }
}
