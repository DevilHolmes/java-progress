//10.WAP in java using array object of the class, the program will 		accept customer name , customer cell , customer pkg and 	 	customer age for 3 customer and display the same. Hint – 		use 	the concept of array object of class and do it using 2 	classes.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code10 {
    public  static class Customer{
        private String customerName;
        private String customerCell;
        private String customerPkg;
        private int customerAge;

        public Customer(String customerName, String customerCell, String customerPkg, int customerAge){
            this.customerName = customerName;
            this.customerCell = customerCell;
            this.customerPkg = customerPkg;
            this.customerAge = customerAge;
        }

        public String toString(){
            return "Name: " + customerName + "\n" + "Cell: " + customerCell + "\n" + "Package: " + customerPkg + "\n" + "Age: " + customerAge + "\n";
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Customer[] customers = new Customer[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Enter details for customer " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = reader.readLine();
            System.out.print("Cell: ");
            String cell = reader.readLine();
            System.out.print("Package: ");
            String pkg = reader.readLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(reader.readLine());

            customers[i] = new Customer(name, cell, pkg, age);
        }

        System.out.println("\nCustomer Details:");
        for(Customer customer : customers){
            System.out.println(customer);
        }
    }
}