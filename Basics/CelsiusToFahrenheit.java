import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Convert Celsius to Fahrenheit using the formula (C * 9/5) + 32
        // Note: Using 9.0 instead of 9 ensures floating-point division
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        
        // Display the converted temperature
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        
        // Close the scanner resource
        scanner.close();
    }
}
