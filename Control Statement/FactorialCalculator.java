import java.util.Scanner;

public class FactorialCalculator {

    // Iterative approach
    public static long getFactorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive approach
    public static long getFactorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * getFactorialRecursive(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            System.out.println("\n--- Results ---");
            System.out.println("Factorial (Iterative): " + getFactorialIterative(n));
            System.out.println("Factorial (Recursive): " + getFactorialRecursive(n));
        }

        scanner.close();
    }
}