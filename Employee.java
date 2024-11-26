package restaurant_Nandini;

public abstract sealed class Employee permits Manager, Chef, Waiter {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void performDuties();
}