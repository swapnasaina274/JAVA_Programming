public class MaxDifference {
    public static int maxAbsDiff(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0; // Cannot form a pair
        }

        int minEle = arr[0];
        int maxEle = arr[0];

        // Track the minimum and maximum elements in a single loop
        for (int i = 1; i < arr.length; i++) {
            minEle = Math.min(minEle, arr[i]);
            maxEle = Math.max(maxEle, arr[i]);
        }

        return maxEle - minEle;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3};
        System.out.println("Maximum Absolute Difference: " + maxAbsDiff(arr)); // Output: 4 (5 - 1)
    }
}
