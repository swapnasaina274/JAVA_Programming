import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        // Read the decimal number from the user
        double number = scanner.nextDouble();
        
        // Calculate the square by multiplying the number by itself
        double square = number * number;
        
        // Display the result
        System.out.println("The square of " + number + " is: " + square);
        
        // Close the scanner resource
        scanner.close();
    }
}
