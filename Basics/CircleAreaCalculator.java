import java.util.Scanner; // Import the Scanner class to read user input

public class CircleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        
        // Read the radius as a double to handle decimal values
        double radius = scanner.nextDouble();
        
        // Calculate the area using the formula: Area = π * r^2
        // Math.PI provides the precise value of π (3.14159...)
        double area = Math.PI * radius * radius;
        
        // Display the calculated area
        System.out.println("The area of the circle is: " + area);
        
        // Close the scanner object to prevent memory leaks
        scanner.close();
    }
}
