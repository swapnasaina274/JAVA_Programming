import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            // Approach 1: Using a loop
            long loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Approach 2: Using the mathematical formula N * (N + 1) / 2
            long formulaSum = (long) n * (n + 1) / 2;

            System.out.println("\n--- Results ---");
            System.out.println("Sum using Loop: " + loopSum);
            System.out.println("Sum using Formula: " + formulaSum);
        }

        scanner.close();
    }
}