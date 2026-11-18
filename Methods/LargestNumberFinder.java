public class LargestNumberFinder {

    /**
     * Finds and returns the largest of three numbers.
     */
    public static double findLargest(double num1, double num2, double num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static void main(String[] args) {
        double largest = findLargest(12.5, 45.2, 30.8);
        System.out.println("The largest number is: " + largest); // Output: 45.2
    }
}
