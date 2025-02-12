package com.tit.day01javagenerics.smartwarehousemanagementsystem;
import java.util.ArrayList;
import java.util.List;

// Creating a class WarehouseManagement to demonstrate the functionalities of the Smart Warehouse Management System
class WarehouseManagement
{
    public static void main(String[] args) {
        // Creating objects of Storage classes for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 1200.00, "Dell"));
        electronicsStorage.addItem(new Electronics("Smartphone", 800.00, "Samsung"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Milk", 2.50, "2025-02-15", "2025-01-15"));
        groceriesStorage.addItem(new Groceries("Bread", 1.20, "2025-02-10", "2025-02-01"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 50.00, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 120.00, "Metal"));

        // Display all items in each category
        System.out.println("Electronics Storage:");
        electronicsStorage.displayAllItems();

        System.out.println("\nGroceries Storage:");
        groceriesStorage.displayAllItems();

        System.out.println("\nFurniture Storage:");
        furnitureStorage.displayAllItems();

        // Using Warehouse class to display all items from different storages
        System.out.println("\nDisplaying all items in the warehouse:");
        List<WarehouseItem> allItems = new ArrayList<>();
        allItems.addAll(electronicsStorage.getItems());
        allItems.addAll(groceriesStorage.getItems());
        allItems.addAll(furnitureStorage.getItems());

        Warehouse.displayAllItemsInStorage(allItems);
    }
}