package restaurant_Nandini;

import java.util.Date;

public class Reservation {
    private Customer customer;
    private int tableNumber;
    private Date reservationDate;

    // Overloaded constructors
    public Reservation(Customer customer, int tableNumber) {
        this(customer, tableNumber, new Date()); // Using this()
    }

    public Reservation(Customer customer, int tableNumber, Date reservationDate) {
        this.customer = customer;
        this.setTableNumber(tableNumber);
        this.reservationDate = reservationDate;
    }

    // Getters
    public Customer getCustomer() {
        return customer;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
}
