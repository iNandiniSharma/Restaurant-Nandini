package restaurant_Nandini;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Restaurant {
    private ArrayList<Order> orders;

    public Restaurant() {
        orders = new ArrayList<>();
    }

    // Add an order to the restaurant system
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Filter orders using a Predicate and method reference
    public List<Order> filterOrders(Predicate<Order> condition) {
        return orders.stream().filter(condition).collect(Collectors.toList());
    }

    // Filter served orders using a method reference
    public List<Order> getServedOrders() {
        return filterOrders(Order::isServed);
    }
}
