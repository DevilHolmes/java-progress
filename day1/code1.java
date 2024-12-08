//1. WAP in java which will accept your name and display on the screen
import java.util.Scanner;
public class code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
        scanner.close();
    }
}