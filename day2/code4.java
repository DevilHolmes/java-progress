//4.WAP in java which will accept N numbers from command line 	argument and will display the total number of even, total 	number of odd, sum of even, sum of odd and the GRAND TOTAL
import java.util.*;
public class code4 {
    public static void main(String[] args) {
        int totalEven = 0;
        int totalOdd = 0;
        int sumEven = 0;
        int sumOdd = 0;
        int grandTotal = 0;

        for (String arg : args) {
            int number = Integer.parseInt(arg);
            grandTotal += number;

            if (number % 2 == 0) {
                totalEven++;
                sumEven += number;
            } else {
                totalOdd++;
                sumOdd += number;
            }
        }

        System.out.println("Total number of even numbers: " + totalEven);
        System.out.println("Total number of odd numbers: " + totalOdd);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Grand total of all numbers: " + grandTotal);
    }
}