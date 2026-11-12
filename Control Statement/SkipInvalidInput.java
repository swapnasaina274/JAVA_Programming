import java.util.InputMismatchException;
import java.util.Scanner;

public class SkipInvalidInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validCount = 0;

        System.out.println("Enter 5 valid positive numbers:");

        while (validCount < 5) {
            System.out.print("Enter number #" + (validCount + 1) + ": ");

            // Check if the next token is an integer
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next(); // Consume and discard the invalid token
                continue;       // Skip the rest of the loop and re-prompt
            }

            int number = scanner.nextInt();

            // Skip zero or negative numbers
            if (number <= 0) {
                System.out.println("Skipped: Number must be positive (greater than 0).");
                continue;       // Skip the rest of the loop
            }

            // Process the valid positive number
            System.out.println("Accepted valid number: " + number);
            validCount++;
        }

        System.out.println("All 5 valid numbers collected successfully!");
        scanner.close();
    }
}
