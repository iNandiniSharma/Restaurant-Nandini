// Package declaration
package restaurant_Nandini;

//'Manager' class: Represents a restaurant manager
//Extends the 'Employee' class to inherit shared employee functionality
public final class Manager extends Employee {
    
	// Constructor: Initializes a manager with a name
	public Manager(String name) {
        super(name);	// Calls the superclass (Employee) constructor to set the name
    }

	// Overridden method: Defines the specific duties of a manager
    @Override
    public void performDuties() {
        System.out.println("Managing the restaurant...");		// Prints the manager's role
    }
}
