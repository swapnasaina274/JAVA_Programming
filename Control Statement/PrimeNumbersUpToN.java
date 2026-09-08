import java.util.Arrays;

public class PrimeNumbersUpToN {

    public static void printPrimesUpToN(int n) {
        if (n < 2) {
            System.out.println("There are no prime numbers in this range.");
            return;
        }

        // boolean array to mark prime status (default is false)
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // Assume all numbers are prime initially

        isPrime[0] = false; // 0 is not prime
        isPrime[1] = false; // 1 is not prime

        // Mark multiples of prime numbers
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // Mark multiples of p starting from p^2
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Print all prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N = 50;
        printPrimesUpToN(N);
    }
}