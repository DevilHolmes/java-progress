//Write a program to print the week day for the given day no. of the current month using switch case statement
import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number (1-31): ");
        int day = scanner.nextInt();
        if (day < 1 || day > 31) {
            System.out.println("Invalid day number. Please enter a value between 1 and 31.");
        } else {
            String weekday = "";
            switch (day % 7) {
                case 1:
                    weekday = "Sunday";
                    break;
                case 2:
                    weekday = "Monday";
                    break;
                case 3:
                    weekday = "Tuesday";
                    break;
                case 4:
                    weekday = "Wednesday";
                    break;
                case 5:
                    weekday = "Thursday";
                    break;
                case 6:
                    weekday = "Friday";
                    break;
                case 0:
                    weekday = "Saturday";
                    break;
            }
            System.out.println("The weekday for day " + day + " is: " + weekday);
        }
        scanner.close();
    }
}