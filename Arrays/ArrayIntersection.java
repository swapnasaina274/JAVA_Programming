import java.util.HashSet;

public class ArrayIntersection {
    public static int[] findUniqueIntersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();
        
        // Add all elements from the first array to a hash set
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Check if elements from the second array exist in the hash set
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num); // Automatically handles duplicates
            }
        }
        
        // Convert the set back to a primitive int array
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5, 9};
        int[] arr2 = {9, 4, 9, 8, 4};
        
        int[] result = findUniqueIntersection(arr1, arr2);
        // Output: [4, 9] (or [9, 4])
        System.out.println(java.util.Arrays.toString(result)); 
    }
}
