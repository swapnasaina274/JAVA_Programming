import java.util.Scanner;

public class Quotient_And_Remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        // Calculate quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Display results
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

        scanner.close();
    }
}
