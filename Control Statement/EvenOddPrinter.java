import java.util.Scanner;

public class EvenOddPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number N: ");
        int n = scanner.nextInt();

        System.out.println("\n--- Even Numbers ---");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\n--- Odd Numbers ---");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        scanner.close();
    }
}