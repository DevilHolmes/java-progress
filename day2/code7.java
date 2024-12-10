//7.Display the element on an array using for each loop. The array 	value shall be taken from keyboard.
import java.util.Scanner;

public class code7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        scanner.close();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("The elements in the array are:");
        for (int element : array) {
            System.out.println(element);
        }
    }
}
