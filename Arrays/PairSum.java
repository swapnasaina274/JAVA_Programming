import java.util.HashSet;

public class PairSum {
    public static int[] findPair(int[] nums, int target) {
        // Create a set to store numbers we have already seen
        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;

            // If the complement is already in the set, we found our pair
            if (seenNumbers.contains(complement)) {
                return new int[] { complement, num };
            }

            // Otherwise, add the current number to the set
            seenNumbers.add(num);
        }

        // Return an empty array if no such pair exists
        return new int[] {}; 
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = findPair(nums, target);

        if (result.length == 2) {
            System.out.println("Pair found: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("No pair found with the given target sum.");
        }
    }
}
