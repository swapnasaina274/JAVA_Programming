public class Calculator {

    // Overloaded sum() method for two integers
    public int sum(int a, int b) {
        return a + b;
    }

    // Overloaded sum() method for three integers
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calls the two-integer version
        System.out.println("Sum of 2 numbers: " + calc.sum(10, 20)); 

        // Calls the three-integer version
        System.out.println("Sum of 3 numbers: " + calc.sum(10, 20, 30)); 
    }
}
