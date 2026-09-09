import java.util.Scanner;

public class DigitCounterAndSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int temp = Math.abs(number); // Work with absolute value to handle negative numbers
        int count = 0;
        int sum = 0;

        if (temp == 0) {
            count = 1;
            sum = 0;
        } else {
            while (temp > 0) {
                int lastDigit = temp % 10;
                sum += lastDigit;
                count++;
                temp /= 10;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Original Number: " + number);
        System.out.println("Number of Digits: " + count);
        System.out.println("Sum of Digits: " + sum);

        scanner.close();
    }
}