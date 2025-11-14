package com.ecommerce;

import java.util.List;

public class Order implements Payable {
    private int orderId;
    private Customer customer;
    private List<Product> productList;
    private String orderDate;
    private static int orderCounter = 0;
    
    // Static initializer block
    static {
        System.out.println("Order processing system starting up.");
    }
    
    // Instance initializer block
    {
        orderCounter++;
        this.orderId = orderCounter;
        System.out.println("New Order ID generated: " + orderId);
    }
    
    public Order(Customer customer, List<Product> productList, String orderDate) {
        this.customer = customer;
        this.productList = productList;
        this.orderDate = orderDate;
    }
    
    // Getters
    public int getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public List<Product> getProductList() { return productList; }
    public String getOrderDate() { return orderDate; }
    
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getUsername());
        System.out.println("Date: " + orderDate);
    }
    
    @Override
    public double calculateTotal(double taxRate) {
        double subtotal = 0.0;
        for (Product product : productList) {
            subtotal += product.getPrice();
        }
        return subtotal * (1 + taxRate);
    }
}