package com.example.onlineelectronicsstore.repository.impl;

import com.example.onlineelectronicsstore.model.Product;
import com.example.onlineelectronicsstore.repository.ProductRepository;
import java.util.*;

public class InMemoryProductRepository implements ProductRepository {
    private final Map<Long, Product> products = new HashMap<>();
    private long nextId = 1;

    @Override
    public Product save(Product product) {
        if (product.getProductId() == null) {
            product.setProductId(nextId++);
        }
        products.put(product.getProductId(), product);
        return product;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(products.get(id));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void deleteById(Long id) {
        products.remove(id);
    }
}