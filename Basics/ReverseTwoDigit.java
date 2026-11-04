import java.util.Scanner;

public class ReverseTwoDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();
        
        // Extract the last digit (tens place becomes units place)
        int lastDigit = number % 10;
        
        // Extract the first digit (units place becomes tens place)
        int firstDigit = number / 10;
        
        // Combine them into the reversed number
        int reversedNumber = (lastDigit * 10) + firstDigit;
        
        System.out.println("Reversed number: " + reversedNumber);
        
        scanner.close();
    }
}
