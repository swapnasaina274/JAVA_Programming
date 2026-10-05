import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElement {
    public static int findFirstNonRepeating(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 1: Build the frequency map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Traverse the array again to find the first element with frequency 1
        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                return num; // Return the first non-repeating element immediately
            }
        }

        return 0; // Return 0 (or -1) if no unique element exists
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, 3, 2};
        System.out.println("First non-repeating element: " + findFirstNonRepeating(arr)); 
        // Output: 3
    }
}
