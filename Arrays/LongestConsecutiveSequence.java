import java.util.HashSet;
import java.util.Set;

public class  LongestConsecutiveSequence{
    public int longestConsecutive(int[] nums) {
        // Base case: an empty array has a sequence length of 0
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Step 1: Insert all numbers into a HashSet to remove duplicates 
        // and allow O(1) lookups.
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Step 2: Iterate through the set elements to find sequence starters
        for (int num : numSet) {
            // Check if 'num' is the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Step 3: Count how far this sequence goes
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // Keep track of the maximum length found
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence solver = new LongestConsecutiveSequence();
        int[] nums = {100, 4, 200, 1, 3, 2};
        
        // The longest consecutive sequence is [1, 2, 3, 4], length = 4
        System.out.println("Longest Sequence Length: " + solver.longestConsecutive(nums)); 
    }
}
