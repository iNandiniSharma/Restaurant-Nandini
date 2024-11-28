package restaurant_Nandini;

import java.util.Scanner;

public class Main {
  
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
        // Create a restaurant
        Restaurant restaurant = new Restaurant();

        // Create some customers and orders
        
        System.out.print("Enter a name: ");
		String name = sc.next();
        
		System.out.print("Enter your email id: ");
		String emailid = sc.next();
		
        //Customer customer1 = new Customer("ABC", "abc@example.com");
        Customer customer1 = new Customer(name, emailid);
        
        Order order1 = new Order(customer1);
        order1.addItems(new MenuItemRecord("Burger", 8.99), new MenuItemRecord("Soda", 2.50));

        restaurant.addOrder(order1);

        // Print order receipt
        System.out.println(order1.generateReceipt());

        // Update order status
        order1.setStatus(OrderStatus.SERVED);

        // Process order
        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(order1);
    }
}
