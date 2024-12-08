// Package declaration
package restaurant_Nandini;

//Import required classes
import java.util.Scanner;

public class Main {
  
	// Static Scanner object for user input
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Create a restaurant instance
		// Manages orders and related operations
        Restaurant restaurant = new Restaurant();

        // Prompt user to create a customer
        System.out.print("Enter a name: ");
		String name = sc.next();
        
		System.out.print("Enter your email id: ");
		String emailid = sc.next();
		
		Customer customer1 = new Customer(name, emailid);
        
        // Create a new Customer object with the provided name and email
        Order order1 = new Order(customer1);
        order1.addItems(new MenuItemRecord("Burger", 8.99), new MenuItemRecord("Soda", 2.50));

        // Add the order to the restaurant's order management system
        restaurant.addOrder(order1);

        // Generate and print the receipt for the order
        System.out.println(order1.generateReceipt());

        // Update the order's status to 'SERVED'
        order1.setStatus(OrderStatus.SERVED);

        // Process the order based on its updated status
        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(order1);
    }
}
