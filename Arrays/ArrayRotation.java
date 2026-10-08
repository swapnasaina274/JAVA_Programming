import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        // Clone for demonstration purposes
        int[] leftRotated = array1.clone();
        int[] rightRotated = array1.clone();

        leftRotate(leftRotated, k);
        System.out.println("Left Rotated by " + k + ":  " + Arrays.toString(leftRotated));
        // Output: [4, 5, 6, 7, 1, 2, 3]

        rightRotate(rightRotated, k);
        System.out.println("Right Rotated by " + k + ": " + Arrays.toString(rightRotated));
        // Output: [5, 6, 7, 1, 2, 3, 4]
    }

    // Rotates the array to the left by k positions
    public static void leftRotate(int[] arr, int k) {
        if (arr == null || arr.length == 0) return;
        int n = arr.length;
        k = k % n; // Handle k > n

        reverse(arr, 0, k - 1);  // Step 1: Reverse first k elements
        reverse(arr, k, n - 1);  // Step 2: Reverse remaining elements
        reverse(arr, 0, n - 1);  // Step 3: Reverse the whole array
    }

    // Rotates the array to the right by k positions
    public static void rightRotate(int[] arr, int k) {
        if (arr == null || arr.length == 0) return;
        int n = arr.length;
        k = k % n; // Handle k > n

        reverse(arr, 0, n - 1);  // Step 1: Reverse the whole array
        reverse(arr, 0, k - 1);  // Step 2: Reverse first k elements
        reverse(arr, k, n - 1);  // Step 3: Reverse remaining elements
    }

    // Helper method to reverse a subsection of the array in place
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
