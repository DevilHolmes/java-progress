//9.WAP in java which will ask the user – How many toy details you 	want to accept, than the program will accept the Toy Id, Toy 	name,  Toy Qty and Toy price from the user  and finally the 	program will display the individual details of all the toys and 	Grand total of the billing amount. Hint – do the program using 	two different classes
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code9 {
    static public class Toy {
        private int toyId;
        private String toyName;
        private int toyQty;
        private double toyPrice;
    
        public Toy(int toyId, String toyName, int toyQty, double toyPrice) {
            this.toyId = toyId;
            this.toyName = toyName;
            this.toyQty = toyQty;
            this.toyPrice = toyPrice;
        }
    
        public double getTotalPrice() {
            return toyQty * toyPrice;
        }

        public String toString() {
            return "Toy ID: " + toyId + "\n" + " Toy Name: " + toyName + "\n" + " Quantity: " + toyQty + "\n" + " Price: " + toyPrice + "\n" + " Total: " + getTotalPrice() + "\n";
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many toy details you want to accept?");
        int numberOfToys = Integer.parseInt(reader.readLine());

        Toy[] toys = new Toy[numberOfToys];
        double grandTotal = 0;

        for (int i = 0; i < numberOfToys; i++) {
            System.out.println("Enter details for toy " + (i + 1) + ":");
            System.out.print("Toy ID: ");
            int toyId = Integer.parseInt(reader.readLine());
            System.out.print("Toy Name: ");
            String toyName = reader.readLine();
            System.out.print("Toy Quantity: ");
            int toyQty = Integer.parseInt(reader.readLine());
            System.out.print("Toy Price: ");
            double toyPrice = Double.parseDouble(reader.readLine());

            toys[i] = new Toy(toyId, toyName, toyQty, toyPrice);
            grandTotal += toys[i].getTotalPrice();
        }

        System.out.println("\nToy Details:");
        for (Toy toy : toys) {
            System.out.println(toy);
        }

        System.out.println("\nGrand Total: " + grandTotal);
    }
}