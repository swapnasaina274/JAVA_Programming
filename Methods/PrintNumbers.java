public class PrintNumbers{
    static void print1ToN(int n) {
        // Base case: stop recursion when n reaches 0 or less
        if (n <= 0) {
            return;
        }

        // Recursive call for n - 1
        print1ToN(n - 1);

        // Print current number after the recursive call returns
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        print1ToN(n); // Output: 1 2 3 4 5
    }
}
