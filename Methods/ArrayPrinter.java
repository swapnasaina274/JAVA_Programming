public class ArrayPrinter {

    // Method that accepts an integer array and prints each element
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println(); // Moves to a new line after printing
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        printArray(numbers); // Output: 10 20 30 40 50
    }
}
