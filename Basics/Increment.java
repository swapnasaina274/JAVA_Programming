public class Increment {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        // Post-Increment: Uses the current value FIRST, then increments
        System.out.println("Post-Increment (a++): " + (a++)); // Prints 5
        System.out.println("Value of 'a' after:    " + a);   // Prints 6

        // Pre-Increment: Increments FIRST, then uses the updated value
        System.out.println("Pre-Increment (++b):  " + (++b)); // Prints 6
        System.out.println("Value of 'b' after:    " + b);   // Prints 6
    }
}