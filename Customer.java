// Package declaration
package restaurant_Nandini;

//Represents a Customer with name and contact information
public class Customer {
    
	// Private fields to store customer details (encapsulation)
	private String name;
    private String contactInfo;

    // Constructor with one parameter: Defaults the contact info to "Unknown"
    public Customer(String name) {
        this(name, "Unknown"); // Calls the other constructor using 'this()'
    }

    // Constructor with two parameters: Initializes both name and contact info
    public Customer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters for 'name' field to demonstrate Encapsulation
    public String getName() {
        return name;
    }

    // Setter for 'name' field: Allows updating the customer's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'contactInfo' field
    public String getContactInfo() {
        return contactInfo;
    }

    // Setter for 'contactInfo' field: Allows updating the contact information	
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
