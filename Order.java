package restaurant_Nandini;

import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<MenuItemRecord> items;
    private OrderStatus status;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.status = OrderStatus.PENDING;
    }

    // Add an item using varargs
    public void addItems(MenuItemRecord... menuItems) {
        for (MenuItemRecord item : menuItems) {
            items.add(item);
        }
    }

    // Method to print order receipt using StringBuilder
    public String generateReceipt() {
        StringBuilder receipt = new StringBuilder();
        receipt.append("Customer: ").append(customer.getName()).append("\n");
        receipt.append("Items Ordered:\n");
        for (MenuItemRecord item : items) {
            receipt.append(item.name()).append(" - $").append(item.price()).append("\n");
        }
        receipt.append("Total: $").append(calculateTotal()).append("\n");
        receipt.append("Status: ").append(status);
        return receipt.toString();
    }

    // Calculate the total price of the order
    private double calculateTotal() {
        return items.stream().mapToDouble(MenuItemRecord::price).sum();
    }

    // Change order status
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public boolean isServed() {
        return status == OrderStatus.SERVED;
    }
}
