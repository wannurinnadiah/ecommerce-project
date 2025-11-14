import com.ecommerce.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Nurin", "nurin88@gmail.com");
        Customer c2 = new Customer("Nadiah");
        c1.setAddress("A-15-6 Sentul");

        Administrator a1 = new Administrator("AdminUser", "admin@ecom.com");
        a1.setDepartment("Logistics");

        Product p1 = new Product("Laptop", 1200.00, "SKUI001");
        Product p2 = new Product("Mouse", 25.50, "SKUI002");
        System.out.println("Total products cataloged: " + Product.getTotalProducts());

        Order o1 = new Order(c1, Arrays.asList(p1, p2), "2025-10-25");
        o1.displayOrder();
        
        //2 decimal places
        System.out.println("Order total with 5% tax: $" + String.format("%.2f", o1.calculateTotal(0.05)));

        //Nested Class
        ECommerce.Inventory mainWarehouse = new ECommerce.Inventory("Main Warehouse");
        mainWarehouse.checkStock(p1);
        
        // Additional tests
        System.out.println("\n--- Additional Tests ---");
        c1.displayProfile();
        a1.displayProfile();
    }
}