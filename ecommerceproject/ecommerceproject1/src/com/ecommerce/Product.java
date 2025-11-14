package com.ecommerce;

public class Product {
    private String name;
    private double price;
    private final String sku;
    private static int totalProducts = 0;
    
    public Product(String name, double price, String sku) {
        this.name = name;
        this.price = price;
        this.sku = sku;
        totalProducts++;
    }
    
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getSku() { return sku; }
    public static int getTotalProducts() { return totalProducts; }
    
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
} 