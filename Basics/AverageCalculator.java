import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Average Calculator ---");
        
        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        
        // Calculate the sum and average
        double sum = num1 + num2 + num3;
        double average = sum / 3.0; // Dividing by 3.0 ensures floating-point precision
        
        // Display the results
        System.out.println("\nResults:");
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        
        // Close the scanner resource
        scanner.close();
    }
}
