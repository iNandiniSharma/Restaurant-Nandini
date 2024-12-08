// Package declaration
package restaurant_Nandini;

//Final class 'Waiter' extends the 'Employee' class
//Use case: Represents a specific type of employee in a restaurant who serves customers
public final class Waiter extends Employee {
	
	// Constructor: Initializes a Waiter object with a name
    // Use case: Every waiter must have a name when created
    public Waiter(String name) {
        super(name);
    }

    // Overridden method: Provides the specific duties of a waiter
    @Override
    public void performDuties() {
        System.out.println("Serving customers...");
    }
}