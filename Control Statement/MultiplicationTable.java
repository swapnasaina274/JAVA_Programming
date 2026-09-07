import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("\n--- Multiplication Table for " + num + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %d\n", num, i, (num * i));
        }

        scanner.close();
    }
}