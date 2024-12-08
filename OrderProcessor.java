// Package declaration
package restaurant_Nandini;

//Class 'OrderProcessor' handles the processing of orders based on their status
public class OrderProcessor {
	
	// Method 'processOrder' processes an order based on its status
    // Parameter: 'Order order' - the order to be processed
    // Use case: Performs actions based on the order's current status
    public void processOrder(Order order) {
       
    	// Enhanced switch expression for concise handling of enum values
    	switch (order.getStatus()) {
            case PENDING -> System.out.println("Order is pending..."); 		// Action when the order status is PENDING
            case SERVED -> System.out.println("Order has been served.");	// Action when the order status is SERVED
            case CANCELLED -> System.out.println("Order was cancelled.");	// Action when the order status is CANCELLED
            default -> throw new IllegalStateException("Unexpected value: " + order.getStatus());  // Handles unexpected or invalid order status values
        }
    }
}
