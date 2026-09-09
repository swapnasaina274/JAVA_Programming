import java.util.Scanner;

public class ArmstrongChecker {

    // Helper method to count digits
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        if (number < 0) return false; // Negative numbers are generally not considered Armstrong

        int numDigits = countDigits(number);
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, numDigits);
            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " IS an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
}