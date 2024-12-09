package restaurant_Nandini;

	// Menu class to represent a food item
	class Menu {
	    private int id;
	    private String name;
	    private double price;

	    public Menu(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    @Override
	    public String toString() {
	        return String.format("%d. %-15s $%.2f", id, name, price);
	    }
	}

