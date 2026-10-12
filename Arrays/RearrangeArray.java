import java.util.Arrays;

public class RearrangeArray {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Pointers for placing positive and negative numbers
        int posIndex = 0; // Even positions (0, 2, 4...)
        int negIndex = 1; // Odd positions (1, 3, 5...)
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[posIndex] = nums[i];
                posIndex += 2;
            } else {
                result[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] rearranged = rearrangeArray(arr);
        System.out.println(Arrays.toString(rearranged)); 
        // Output: [3, -2, 1, -5, 2, -4]
    }
}
