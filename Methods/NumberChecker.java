public class NumberChecker {

    // Method that accepts a number and prints its sign
    public static void checkNumber(double number) {
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    public static void main(String[] args) {
        checkNumber(10);      // Output: 10.0 is positive.
        checkNumber(-5.5);    // Output: -5.5 is negative.
        checkNumber(0);       // Output: The number is zero.
    }
}
