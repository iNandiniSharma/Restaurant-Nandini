// Package declaration
package restaurant_Nandini;

// Abstract sealed class 'Employee': Represents the base class for all employees
// Implementing Java
public abstract sealed class Employee permits Manager, Chef, Waiter {
    
	// Private field to store the employee's name
	private String name;

	// Constructor: Initializes the name field
    public Employee(String name) {
        this.name = name;
    }

    // Getter method for the employee's name
    public String getName() {
        return name;
    }

    // Abstract method: Defines a contract for subclasses to implement their specific duties
    public abstract void performDuties();
}