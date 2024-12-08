// Package declaration
package restaurant_Nandini;

//Final class 'Chef': Represents a specific type of Employee who prepares food
//'final' keyword ensures no further sub-classing of the Chef class
public final class Chef extends Employee {
    
	// Constructor: Calls the superclass (Employee) constructor to set the name
	public Chef(String name) {
        super(name);			// Pass the chef's name to the Employee class
    }

	// Overridden method: Implements the specific duties of a Chef
	@Override
    public void performDuties() {
        System.out.println("Preparing food...");	// Prints the Chef's task
    }
}
