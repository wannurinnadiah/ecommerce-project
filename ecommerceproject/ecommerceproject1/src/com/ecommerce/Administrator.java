package com.ecommerce;

public final class Administrator extends User {
    private String department;
    
    public Administrator(String username, String email) {
        super(username, email);
    }
    
    // Getter and setter
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    
    @Override
    public void displayProfile() {
        System.out.println("Administrator Profile:");
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
        System.out.println("Department: " + (department != null ? department : "Not assigned"));
    }
}