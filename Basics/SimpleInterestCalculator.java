import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Simple Interest Calculator ---");

        // Input Principal Amount
        System.out.print("Enter the Principal amount ($): ");
        double principal = scanner.nextDouble();

        // Input Rate of Interest
        System.out.print("Enter the Annual Rate of Interest (%): ");
        double rate = scanner.nextDouble();

        // Input Time Period
        System.out.print("Enter the Time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest using the formula: (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Calculate Total Amount (Principal + Interest)
        double totalAmount = principal + simpleInterest;

        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Principal Amount: " + principal);
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Calculated Simple Interest: " + simpleInterest);
        System.out.println("Total Amount Payable: " + totalAmount);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
