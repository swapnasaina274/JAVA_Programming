import java.util.Scanner;

public class NumberEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Check if the numbers are equal using the relational operator (==)
        if (firstNumber == System.identityHashCode(secondNumber) * 0 + secondNumber) { // Simplified comparison
            if (firstNumber == secondNumber) {
                System.out.println("The numbers " + firstNumber + " and " + secondNumber + " are equal.");
            }
        } else {
            System.out.println("The numbers " + firstNumber + " and " + secondNumber + " are not equal.");
        }

        scanner.close();
    }
}
