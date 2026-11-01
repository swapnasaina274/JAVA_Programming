import java.util.Scanner;

public class FirstDigitFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();
        
        // Ensure the absolute value is used to handle negative numbers properly
        int absoluteNumber = Math.abs(number);
        
        // Check if the input is valid
        if (absoluteNumber >= 10 && absoluteNumber <= 99) {
            // Dividing a two-digit number by 10 gives the first digit
            int firstDigit = absoluteNumber / 10;
            System.out.println("The first digit is: " + firstDigit);
        } else {
            System.out.println("Error: Please enter a valid two-digit number.");
        }
        
        scanner.close();
    }
}
