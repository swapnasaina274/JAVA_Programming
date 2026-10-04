import java.util.HashSet;

public class FirstDuplicate {
    public static int findFirstDuplicateBySecondOccurrence(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            // If the element is already in the set, we found the first duplicate pair
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1; // Return -1 if no duplicates exist
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 3, 2};
        System.out.println(findFirstDuplicateBySecondOccurrence(arr)); // Output: 3
    }
}
