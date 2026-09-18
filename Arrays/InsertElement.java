import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        // Array with capacity of 6, but only 5 active elements
        int[] arr = {10, 20, 30, 40, 50, 0}; 
        int size = 5; // Current number of elements
        int indexToInsert = 2; // Position where to insert
        int newValue = 25;

        // Shift elements to the right starting from the end
        for (int i = size; i > indexToInsert; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element
        arr[indexToInsert] = newValue;

        System.out.println(Arrays.toString(arr)); // [10, 20, 25, 30, 40, 50]
    }
}