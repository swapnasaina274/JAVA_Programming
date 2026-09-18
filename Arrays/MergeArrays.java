import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] merged = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);

        System.out.println(Arrays.toString(merged)); // [1, 2, 3, 4, 5, 6]
    }
}