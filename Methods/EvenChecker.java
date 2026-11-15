public class EvenChecker {

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int testNumber1 = 10;
        int testNumber2 = 7;

        System.out.println(testNumber1 + " is even: " + isEven(testNumber1)); // true
        System.out.println(testNumber2 + " is even: " + isEven(testNumber2)); // false
    }
}
