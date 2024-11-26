package restaurant_Nandini;

public final class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void performDuties() {
        System.out.println("Managing the restaurant...");
    }
}
