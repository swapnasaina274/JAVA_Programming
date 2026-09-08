public class FibonacciSeries {

    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int first = 0, second = 1;

        System.out.print("Fibonacci Series (" + n + " terms): ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Compute the next term
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N = 10;
        printFibonacci(N);
    }
}