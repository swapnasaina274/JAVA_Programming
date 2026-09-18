import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int indexToDelete = 2; // Deletes 30 (0-based index)

        // Shift elements to the left starting from the target index
        for (int i = indexToDelete; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Set the last element to 0 (or null for objects) to clear it
        arr[arr.length - 1] = 0;

        System.out.println(Arrays.toString(arr)); // [10, 20, 40, 50, 0]
    }
}