//1.Write a program to print the corresponding grade for the given 	mark using if..else statement in Java
import java.util.Scanner;
public class code1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        int mark = scanner.nextInt();
        if (mark >= 90 && mark <= 100) {
            System.out.println("Your grade is O.");
        } else if (mark >= 80 && mark < 90) {
            System.out.println("Your grade is E.");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("Your grade is A.");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("Your grade is B.");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("Your grade is C.");
        } else if (mark >= 40 && mark < 50) {
            System.out.println("Your grade is D.");
        }else if (mark >= 0 && mark < 40) {
            System.out.println("Your grade is F.");
        } else {
            System.out.println("Invalid mark entered. Please enter a value between 0 and 100.");
        }
        scanner.close();
    }
}