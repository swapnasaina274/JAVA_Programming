public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Step 1: Find the majority candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify if the candidate is actually the majority element
        // (This step can be skipped if a majority element is guaranteed to exist)
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        }

        return -1; // No majority element found
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + findMajorityElement(nums)); // Output: 2
    }
}
