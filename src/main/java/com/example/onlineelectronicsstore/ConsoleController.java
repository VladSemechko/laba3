package com.example.onlineelectronicsstore;

import com.example.onlineelectronicsstore.model.*;
import com.example.onlineelectronicsstore.service.*;
import java.util.Scanner;

public class ConsoleController {
    private final UserService userService;
    private final ProductService productService;
    private final OrderService orderService;
    private final Scanner scanner;

    public ConsoleController(UserService userService, ProductService productService, OrderService orderService) {
        this.userService = userService;
        this.productService = productService;
        this.orderService = orderService;
        this.scanner = new Scanner(System.in, "UTF-8");
    }

    public void start() {
        while (true) {
            printMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> manageUsers();
                case 2 -> manageProducts();
                case 3 -> manageOrders();
                case 0 -> {
                    System.out.println("Выход из программы.");
                    return;
                }
                default -> System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private void printMainMenu() {
        System.out.println("\n=== Главное меню ===");
        System.out.println("1. Управление пользователями");
        System.out.println("2. Управление товарами");
        System.out.println("3. Управление заказами");
        System.out.println("0. Выход");
        System.out.print("Выберите действие: ");
    }

    // Блок управления пользователями
    private void manageUsers() {
        while (true) {
            System.out.println("\n=== Управление пользователями ===");
            System.out.println("1. Список всех пользователей");
            System.out.println("2. Добавить пользователя");
            System.out.println("3. Удалить пользователя");
            System.out.println("0. Назад");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> listAllUsers();
                case 2 -> addUser();
                case 3 -> deleteUser();
                case 0 -> { return; }
                default -> System.out.println("Неверный выбор.");
            }
        }
    }

    private void listAllUsers() {
        System.out.println("\n=== Список пользователей ===");
        userService.findAll().forEach(System.out::println);
    }

    private void addUser() {
        System.out.println("\n=== Добавление пользователя ===");
        User user = new User();

        System.out.print("Введите логин: ");
        user.setUsername(scanner.nextLine());

        System.out.print("Введите email: ");
        user.setEmail(scanner.nextLine());

        System.out.print("Введите телефон: ");
        user.setPhone(scanner.nextLine());

        userService.save(user);
        System.out.println("Пользователь добавлен!");
    }

    private void deleteUser() {
        System.out.print("\nВведите ID пользователя для удаления: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        userService.deleteById(id);
        System.out.println("Пользователь удалён.");
    }

    // Блок управления товарами
    private void manageProducts() {
        while (true) {
            System.out.println("\n=== Управление товарами ===");
            System.out.println("1. Список товаров");
            System.out.println("2. Добавить товар");
            System.out.println("3. Удалить товар");
            System.out.println("0. Назад");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> listAllProducts();
                case 2 -> addProduct();
                case 3 -> deleteProduct();
                case 0 -> { return; }
                default -> System.out.println("Неверный выбор.");
            }
        }
    }

    private void listAllProducts() {
        System.out.println("\n=== Список товаров ===");
        productService.findAll().forEach(System.out::println);
    }

    private void addProduct() {
        System.out.println("\n=== Добавление товара ===");
        Product product = new Product();

        System.out.print("Введите название: ");
        product.setName(scanner.nextLine());

        System.out.print("Введите цену: ");
        product.setPrice(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Введите количество на складе: ");
        product.setStockQuantity(scanner.nextInt());
        scanner.nextLine();

        productService.save(product);
        System.out.println("Товар добавлен!");
    }

    private void deleteProduct() {
        System.out.print("\nВведите ID товара для удаления: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        productService.deleteById(id);
        System.out.println("Товар удалён.");
    }

    // Блок управления заказами
    private void manageOrders() {
        while (true) {
            System.out.println("\n=== Управление заказами ===");
            System.out.println("1. Список заказов");
            System.out.println("2. Создать заказ");
            System.out.println("3. Удалить заказ");
            System.out.println("0. Назад");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> listAllOrders();
                case 2 -> addOrder();
                case 3 -> deleteOrder();
                case 0 -> { return; }
                default -> System.out.println("Неверный выбор.");
            }
        }
    }

    private void listAllOrders() {
        System.out.println("\n=== Список заказов ===");
        orderService.findAll().forEach(System.out::println);
    }

    private void addOrder() {
        System.out.println("\n=== Создание заказа ===");
        Order order = new Order();

        System.out.print("Введите ID пользователя: ");
        order.setUserId(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Введите сумму заказа: ");
        order.setTotalAmount(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Введите статус заказа: ");
        order.setStatus(scanner.nextLine());

        System.out.print("Введите адрес доставки: ");
        order.setShippingAddress(scanner.nextLine());

        orderService.save(order);
        System.out.println("Заказ создан!");
    }

    private void deleteOrder() {
        System.out.print("\nВведите ID заказа для удаления: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        orderService.deleteById(id);
        System.out.println("Заказ удалён.");
    }
}