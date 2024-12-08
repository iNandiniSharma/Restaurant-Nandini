// Package declaration
package restaurant_Nandini;

//Importing essential utilities from Java
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Class 'Restaurant' manages the orders in a restaurant system
public class Restaurant {
	 // List to store orders placed in the restaurant
    private ArrayList<Order> orders;

    // Constructor: Initializes an empty list of orders
    public Restaurant() {
        orders = new ArrayList<>();
    }

    // Method to add an order to the restaurant system
    // Use case: Add and order and keeps track of all orders placed in the restaurant
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Method to filter orders based on a given condition
    // Parameter: 'Predicate<Order>' - a functional interface defining a condition to test each order
    // Returns: A list of orders that meet the condition
    // Use case: Enables dynamic filtering of orders based on different criteria
    public List<Order> filterOrders(Predicate<Order> condition) {
    	// Streams the orders, applies the filtering condition, and collects the matching orders into a list
        return orders.stream().filter(condition).collect(Collectors.toList());
    }

    // Method to get all served orders
    // Returns: A list of orders where the status is 'served'
    // Use case: Quickly retrieves orders that have already been served
    // Filter served orders using a method reference
    public List<Order> getServedOrders() {
    	 // Utilizes 'filterOrders' with a method reference to the 'isServed' method of the 'Order' class
    	return filterOrders(Order::isServed);
    }
}
