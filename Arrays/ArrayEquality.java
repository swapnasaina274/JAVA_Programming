import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 4, 3, 2}; // Same numbers, different order

        // Order matters for Arrays.equals()
        boolean isEqual102 = Arrays.equals(array1, array2); 
        boolean isEqual103 = Arrays.equals(array1, array3); 

        System.out.println("Array1 equals Array2: " + isEqual102); // true
        System.out.println("Array1 equals Array3: " + isEqual103); // false
    }
}
