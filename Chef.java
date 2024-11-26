package restaurant_Nandini;

public final class Chef extends Employee {
    public Chef(String name) {
        super(name);
    }

    @Override
    public void performDuties() {
        System.out.println("Preparing food...");
    }
}
