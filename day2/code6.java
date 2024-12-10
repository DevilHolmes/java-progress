//WAP in java which will accept the mark of 3 subject and print 	the corresponding grade of for the given mark using if..else 	statement in java. use scanner class. Also use separate 	function for accceptDetails() and displayDetails()
import java.util.Scanner;

public class code6 {

    public static void main(String[] args) {
        int[] marks = new int[3];
        acceptDetails(marks);
        displayDetails(marks);
    }
    public static void acceptDetails(int[] marks) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            scanner.close();
        }
    }
    public static void displayDetails(int[] marks) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Marks for subject " + (i + 1) + ": " + marks[i]);
            System.out.println("Grade: " + calculateGrade(marks[i]));
        }
    }
    public static String calculateGrade(int mark) {
        if (mark >= 90) {
            return "O";
        } else if (mark >= 80) {
            return "E";
        } else if (mark >= 70) {
            return "A";
        } else if (mark >= 60) {
            return "B";
        }else if (mark >= 50) {
            return "C";
        }else if (mark >= 40) {
            return "D";
        }else {
            return "F";
        }
    }
}
