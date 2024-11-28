package restaurant_Nandini;

public class OrderProcessor {
    public void processOrder(Order order) {
        switch (order.getStatus()) {
            case PENDING -> System.out.println("Order is pending...");
            case SERVED -> System.out.println("Order has been served.");
            case CANCELLED -> System.out.println("Order was cancelled.");
            default -> throw new IllegalStateException("Unexpected value: " + order.getStatus());
        }
    }
}
