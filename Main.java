package restaurant_Nandini;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
        // Create a restaurant
        Restaurant restaurant = new Restaurant();

        // Create some customers and orders
       
        System.out.print("Enter a name:");
		String name = sc.next();
        
		System.out.print("Enter your email id:");
		String emailid = sc.next();
		
        //Customer customer1 = new Customer("XYZ", "xyz@example.com");
        Customer customer1 = new Customer(name, emailid);
        
    
    }
}