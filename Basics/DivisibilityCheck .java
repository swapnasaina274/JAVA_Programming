import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.class);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Check divisibility using the modulo operator
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 5.");
        }
        
        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
