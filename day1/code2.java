//2. WAP in java which will accept your name age and salary from keyboard sing scanner class and display on the screen
import java.util.Scanner;
public class code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your salary is: " + salary);
        scanner.close();
    }
}