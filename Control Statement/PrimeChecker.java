public class PrimeChecker {

    public static boolean isPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }
        
        // 2 and 3 are prime numbers
        if (n <= 3) {
            return true;
        }
        
        // Eliminate multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        
        // Check divisors using 6k ± 1 rule up to sqrt(n)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int number = 29;
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}