public class MaxOverload {

    // 1. Maximum of two integers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // 2. Maximum of three integers (reuses the two-integer method)
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    // 3. Maximum of two decimal numbers
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Max of 10 and 25: " + max(10, 25));
        System.out.println("Max of 10, 45, and 30: " + max(10, 45, 30));
        System.out.println("Max of 12.5 and 8.9: " + max(12.5, 8.9));
    }
}
