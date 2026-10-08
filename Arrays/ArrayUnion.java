import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayUnion {
    public static int[] findUnion(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        
        // Add elements from the first array
        for (int num : a) {
            set.add(num);
        }
        
        // Add elements from the second array
        for (int num : b) {
            set.add(num);
        }
        
        // Convert the set back to a primitive int array
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 3, 5};
        int[] array2 = {2, 3, 4, 6};
        
        int[] result = findUnion(array1, array2);
        System.out.println("Union: " + Arrays.toString(result));
        // Output: Union: [1, 2, 3, 4, 5, 6] (Order may vary)
    }
}
