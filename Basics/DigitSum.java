import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();
        
        // Take the absolute value to handle negative numbers properly
        int absNumber = Math.abs(number);
        
        // Validate if the number is indeed two digits
        if (absNumber >= 10 && absNumber <= 99) {
            int firstDigit = absNumber / 10; // Extracts the tens digit
            int secondDigit = absNumber % 10; // Extracts the ones digit
            int sum = firstDigit + secondDigit;
            
            System.out.println("The sum of the digits is: " + sum);
        } else {
            System.out.println("Error: Please enter a valid two-digit number.");
        }
        
        scanner.close();
    }
}
