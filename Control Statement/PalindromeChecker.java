import java.util.Scanner;

public class PalindromeChecker {

    // Method to reverse a number
    public static int reverseNumber(int number) {
        int reversed = 0;
        int temp = Math.abs(number); // Handle positive value for reversal

        while (temp > 0) {
            int lastDigit = temp % 10;
            reversed = (reversed * 10) + lastDigit;
            temp /= 10;
        }

        return number < 0 ? -reversed : reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int originalNumber = scanner.nextInt();

        int reversedNumber = reverseNumber(originalNumber);

        System.out.println("\n--- Results ---");
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);

        // A palindrome number remains equal to its original value when reversed
        if (originalNumber == reversedNumber && originalNumber >= 0) {
            System.out.println("Status: It IS a Palindrome!");
        } else {
            System.out.println("Status: It is NOT a Palindrome.");
        }

        scanner.close();
    }
}