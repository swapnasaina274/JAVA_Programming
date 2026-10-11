public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        // Initialize with the first element to correctly handle arrays with all negative numbers
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide whether to add the current element to the existing subarray 
            // or start a new subarray from the current element
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Track the maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result); 
        // Output: 6 (from the subarray [4, -1, 2, 1])
    }
}
