public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 40, 30};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // Find largest and second largest
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

            // Find smallest and second smallest
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second largest = " + secondLargest);
        System.out.println("Second smallest = " + secondSmallest);
    }
}