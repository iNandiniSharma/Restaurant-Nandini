// Package declaration
package restaurant_Nandini;

//Importing ArrayList for managing the list of menu items
import java.util.ArrayList;

public class Order {
	
	// Private attributes for encapsulation
    private Customer customer;					// The customer who placed the order
    private ArrayList<MenuItemRecord> items;	// List of items in the order
    private OrderStatus status;					// Current status of the order (PENDING, SERVED, CANCELLED)

    // Constructor: Initializes an order with a customer and default values
    public Order(Customer customer) {
        this.customer = customer;				// Assigns the customer
        this.items = new ArrayList<>();			// Initializes an empty list of items
        this.status = OrderStatus.PENDING;		// Sets the default order status to PENDING
    }

    // Method: Add multiple items to the order using varargs
    // Use case: Simplifies adding multiple items in one call
    public void addItems(MenuItemRecord... menuItems) {		// Iterates through provided items
        for (MenuItemRecord item : menuItems) {				// Adds each item to the order
            items.add(item);
        }
    }

    // Method: Generate a receipt for the order
    // Use case: Provides a detailed summary of the customer's order
    public String generateReceipt() {
        StringBuilder receipt = new StringBuilder();							// Efficiently builds the receipt string
        receipt.append("Customer: ").append(customer.getName()).append("\n");	// Adds customer name
        receipt.append("Items Ordered:\n");										// Header for ordered items
        for (MenuItemRecord item : items) {										// Iterates through ordered items
            receipt.append(item.name()).append(" - $").append(item.price()).append("\n");	// Appends item name, item price
        }
        receipt.append("Total: $").append(calculateTotal()).append("\n");		// Adds total cost	
        receipt.append("Status: ").append(status);								// Returns the generated receipt
        return receipt.toString();
    }

    // Private Method: Calculate the total price of the order
    // Use case: Computes the sum of prices for all items in the order
    private double calculateTotal() {
        return items.stream().mapToDouble(MenuItemRecord::price).sum();			// Uses stream to calculate sum
    }
    
    // Method: Update the status of the order
    // Use case: Enables status transitions (e.g., from PENDING to SERVED)
    public void setStatus(OrderStatus status) {
        this.status = status;													// Updates the order status
    }

    // Method: Retrieve the current order status
    // Use case: Used to check the status of the order
    public OrderStatus getStatus() {
        return status;
    }

    // Method: Check if the order is served
    // Use case: Determines if the order has been completed and served
    public boolean isServed() {
        return status == OrderStatus.SERVED;									// Returns true if status is SERVED
    }
}
