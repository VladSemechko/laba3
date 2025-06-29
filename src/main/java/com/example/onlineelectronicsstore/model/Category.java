package com.example.onlineelectronicsstore.model;

public class Category {
    private Long categoryId;
    private String name;

    // Конструкторы
    public Category() {}

    public Category(Long categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    // Геттеры и сеттеры
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                '}';
    }
}