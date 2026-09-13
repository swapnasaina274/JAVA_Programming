public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {40, 50, 60, 70, 80, 90, 100};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}