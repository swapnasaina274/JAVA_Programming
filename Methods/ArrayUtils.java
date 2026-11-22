public class ArrayUtils {

    public static int findMax(int[] arr) {
        // Validate that the array is not null or empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        // Assume the first element is the largest
        int max = arr[0];

        // Compare with the remaining elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {20, 10, 4, 100, 45};
        System.out.println("Maximum element: " + findMax(numbers)); // Output: 100
    }
}
