//5.Write a menu driven program for arithmetic operations (addition, 	subtraction, multiplication & division) for 2 integers using 	switch case. The program will also ask the user whether to 	continue or not and print the default value as invalid choice. Use 	InputSreamReader and BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("Enter your choice: ");

            int choice = Integer.parseInt(reader.readLine());

            System.out.println("Enter the first integer: ");
            int num1 = Integer.parseInt(reader.readLine());

            System.out.println("Enter the second integer: ");
            int num2 = Integer.parseInt(reader.readLine());

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + ((double) num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

            System.out.println("Do you want to continue? (yes/no): ");
            String continueChoice = reader.readLine().trim().toLowerCase();

            if (!continueChoice.equals("yes")) {
                continueProgram = false;
            }
        }

        System.out.println("Program terminated.");
    }
}