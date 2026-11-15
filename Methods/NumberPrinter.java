public class NumberPrinter {
    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Moves to a new line after printing
    }

    public static void main(String[] args) {
        int n = 10;
        printNumbers(n); // Output: 1 2 3 4 5 6 7 8 9 10
    }
}
