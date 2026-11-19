public class LargestNumber {
    public static int findLargest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        System.out.println(findLargest(15, 42, 27)); // Output: 42
    }
}
