//8.Program on two dimensional array, the program will accept the 	size of row and column from the keyboard and the value also 	from the keyboard the output will be displayed in 2D matrix 	form.
import java.util.Scanner;

public class code8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The 2D array in matrix form is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
            scanner.close();
        }
    }
}
