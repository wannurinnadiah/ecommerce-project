package com.ecommerce;

public class ECommerce {
    // Static nested class
    public static class Inventory {
        private String location;
        
        public Inventory(String location) {
            this.location = location;
        }
        
        public void checkStock(Product p) {
            System.out.println("Stock for " + p.getName() + " checked at " + location);
        }
        
        public String getLocation() { return location; }
        public void setLocation(String location) { this.location = location; }
    }
}