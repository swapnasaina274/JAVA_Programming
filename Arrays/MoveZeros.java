import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroesToEnd(int[] nums) {
        // Pointer to keep track of the position for the next non-zero element
        int insertPos = 0; 

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero
            if (nums[i] != 0) {
                // Swap elements at index 'i' and 'insertPos'
                int temp = nums[i];
                nums[i] = nums[insertPos];
                nums[insertPos] = temp;
                
                // Move the pointer forward
                insertPos++; 
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.println("Original: " + Arrays.toString(arr));
        
        moveZeroesToEnd(arr);
        
        System.out.println("Modified: " + Arrays.toString(arr));
        // Output: [1, 3, 12, 0, 0]
    }
}
