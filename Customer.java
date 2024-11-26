package restaurant_Nandini;

public class Customer {
    private String name;
    private String contactInfo;

    // Overloaded constructors
    public Customer(String name) {
        this(name, "Unknown"); // Using this()
    }

    public Customer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Getters and setters to demonstrate Encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
