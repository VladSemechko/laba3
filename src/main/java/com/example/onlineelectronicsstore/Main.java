package com.example.onlineelectronicsstore;

import com.example.onlineelectronicsstore.repository.impl.*;
import com.example.onlineelectronicsstore.service.impl.*;

public class Main {
    public static void main(String[] args) {
        // Инициализация сервисов
        UserServiceImpl userService = new UserServiceImpl(new InMemoryUserRepository());
        ProductServiceImpl productService = new ProductServiceImpl(new InMemoryProductRepository());
        OrderServiceImpl orderService = new OrderServiceImpl(new InMemoryOrderRepository());

        // Запуск консольного интерфейса
        ConsoleController controller = new ConsoleController(userService, productService, orderService);
        controller.start();
    }
}