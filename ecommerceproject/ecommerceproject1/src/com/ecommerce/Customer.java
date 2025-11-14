package com.ecommerce;

public class Customer extends User {
    private String address;
    
    public Customer(String username, String email) {
        super(username, email);
    }
    
    public Customer(String username) {
        super(username, username + "@temp.email");
    }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    @Override
    public void displayProfile() {
        System.out.println("Customer Profile:");
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
        System.out.println("Address: " + (address != null ? address : "Not specified"));
    }
}
