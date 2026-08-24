import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Create Scanner object to read input from keyboard
        Scanner scanner = new Scanner(System.in);

        // Read text input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Read integer input
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Basic arithmetic operation
        int currentYear = 2026; // Get the current year dynamically
                                // int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        // Output result using string concatenation
        System.out.println("Hello " + name + ", you are " + age + " years old.");

        // Close scanner (best practice)
        scanner.close();
    }
}