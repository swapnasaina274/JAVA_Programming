public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30};

        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyPrinted = false;

            // Check if this element appeared before
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // Check if this element appears again
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}