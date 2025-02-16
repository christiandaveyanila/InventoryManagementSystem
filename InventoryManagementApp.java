import java.util.ArrayList;
import java.util.Scanner;

// Product Class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Inventory Management System Class
class InventoryManagementSystem {
    private ArrayList<Product> products;

    public InventoryManagementSystem() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, double price) {
        Product newProduct = new Product(name, price);
        products.add(newProduct);
        System.out.println("\nProduct added: " + name + " - $" + price);
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("\nNo products available.");
        } else {
            System.out.println("\nProduct List:");
            for (Product product : products) {
                System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
            }
        }
    }
}

// Main Application Class
public class InventoryManagementApp {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Inventory Management System");
        System.out.println("Developed by: Christian Dave Santocildes Yanila");
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("\nEnter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    ims.addProduct(name, price);
                    break;
                case 2:
                    ims.displayProducts();
                    break;
                case 3:
                    System.out.println("Goodbye! Thank you for using the Inventory Management System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
