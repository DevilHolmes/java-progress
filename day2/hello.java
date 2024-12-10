public class hello {
    private int toyId;
    private String toyName;
    private int toyQty;
    private double toyPrice;

    // Constructor to initialize the Toy object
    public hello(int toyId, String toyName, int toyQty, double toyPrice) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.toyQty = toyQty;
        this.toyPrice = toyPrice;
    }

    // Getters
    public int getToyId() {
        return toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public int getToyQty() {
        return toyQty;
    }

    public double getToyPrice() {
        return toyPrice;
    }

    // Method to calculate the total price for this toy
    public double getTotalPrice() {
        return toyQty * toyPrice;
    }

    // Method to display toy details
    public void displayToyDetails() {
        System.out.println("Toy ID: " + toyId);
        System.out.println("Toy Name: " + toyName);
        System.out.println("Toy Quantity: " + toyQty);
        System.out.println("Toy Price: " + toyPrice);
        System.out.println("Total Price for this Toy: " + getTotalPrice());
        System.out.println("-----------------------------");
    }
}
