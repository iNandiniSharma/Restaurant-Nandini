// Package declaration
package restaurant_Nandini;

//Importing Date class for reservation dates
import java.util.Date;

//Class 'Reservation' represents a customer's table reservation
public class Reservation {
	// Private attributes for encapsulation
    private Customer customer;
    private int tableNumber;
    private Date reservationDate;

    // Overloaded Constructor: Creates a reservation with the current date as default
    // Use case: Simplifies reservation creation when no specific date is provided
    public Reservation(Customer customer, int tableNumber) {
        this(customer, tableNumber, new Date());
    }

    // Main Constructor: Allows setting all reservation details
    // Use case: Full customization of the reservation at the time of creation
    public Reservation(Customer customer, int tableNumber, Date reservationDate) {
        this.customer = customer;
        this.setTableNumber(tableNumber);
        this.reservationDate = reservationDate;
    }

    // Getter for the customer
    // Use case: Retrieve the customer details associated with this reservation
    public Customer getCustomer() {
        return customer;
    }
    
    // Getter for the reservation date
    // Use case: Retrieve the date and time of the reservation
    public Date getReservationDate() {
        return reservationDate;
    }

    // Getter for the table number
    // Use case: Retrieve the table number assigned to this reservation  
	public int getTableNumber() {
		return tableNumber;
	}

	// Setter for the table number
    // Use case: Modify or set the table number dynamically
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
}
