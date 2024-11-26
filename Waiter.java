package restaurant_Nandini;

public final class Waiter extends Employee {
    public Waiter(String name) {
        super(name);
    }

    @Override
    public void performDuties() {
        System.out.println("Serving customers...");
    }
}