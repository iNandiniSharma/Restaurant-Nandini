// Package declaration
package restaurant_Nandini;

import java.util.ArrayList;
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
        
        //Display Menu and accept the preference
        
     // Create an ArrayList of Menu items
        ArrayList<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu(1, "Burger & Fried", 5.99));
        menuList.add(new Menu(2, "Pizza Combo", 8.99));
        menuList.add(new Menu(3, "Pasta Combo", 7.49));
        menuList.add(new Menu(4, "Salads and Drink", 4.99));
        menuList.add(new Menu(5, "Ice Cream set of 4", 3.99));
        // Display the menu
        Scanner scanner = new Scanner(System.in);
        Menu selectedItem = null;
        
        
        while (true) {
            System.out.println("\nFood Menu:");
            System.out.println("----------------------------");
            for (Menu item : menuList) {
                System.out.println(item);
            }
            System.out.println("----------------------------");

            // Accept user input for menu selection
            System.out.print("\nEnter the ID of the menu item you want to select: ");
            if (scanner.hasNextInt()) {
                int selectedId = scanner.nextInt();

                // Check if the ID is valid
                for (Menu item : menuList) {
                    if (item.getId() == selectedId) {
                        selectedItem = item;
                        break;
                    }
                }

                if (selectedItem == null) {
                    System.out.println("Invalid ID. Please select a valid menu item from 1 to " + menuList.size() + ".");
                } else {
                    // Confirm selection
                    System.out.printf("\nYou selected: %s - $%.2f%n", selectedItem.getName(), selectedItem.getPrice());
                    System.out.print("\nDo you want to proceed with this selection? (Y/N): ");
                    String confirmation = scanner.next();

                    if (confirmation.equalsIgnoreCase("Y")) {
                        System.out.println("\nYou confirmed: " + selectedItem.getName() + " - $" + selectedItem.getPrice());
                        break;  // Exit the loop and proceed
                    } else {
                        // Reset selection and re-display the menu
                        System.out.println("\nSelection canceled. Please select another item.");
                        selectedItem = null;  // Reset selected item
                    }
                }
            } else {
                System.out.println("\nInvalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();

        // Display the selected item
        System.out.printf("\nYou selected: %s - $%.2f%n", selectedItem.getName(), selectedItem.getPrice());
    
        order1.addItems(new MenuItemRecord(selectedItem.getName(), selectedItem.getPrice()));

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
