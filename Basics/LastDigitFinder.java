import java.util.Scanner;

public class LastDigitFinder {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Use Math.abs() to handle negative numbers correctly
        // The % 10 operator returns the remainder (the last digit)
        int lastDigit = Math.abs(number) % 10;

        System.out.println("The last digit is: " + lastDigit);

        // Close the scanner resource
        scanner.close();
    }
}
