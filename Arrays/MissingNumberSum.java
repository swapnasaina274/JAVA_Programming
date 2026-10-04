public class MissingNumberSum {
    public static int findMissingNumber(int[] arr) {
        // Since one number is missing, N is the array length + 1
        long n = arr.length + 1; 
        
        // Sum of first N natural numbers
        long expectedSum = (n * (n + 1)) / 2;
        
        // Sum of elements present in the array
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // The difference is the missing number
        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5}; // 4 is missing
        System.out.println("Missing Number: " + findMissingNumber(arr)); 
    }
}
