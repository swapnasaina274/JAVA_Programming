public class Calculator {

    // 1. Original method: sum of two integers
    public int sum(int a, int b) {
        return a + b;
    }

    // 2. Overloaded method: different number of parameters (three integers)
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // 3. Overloaded method: different data types (two doubles)
    public double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calls the two-integer version
        System.out.println("Sum of 2 ints: " + calc.sum(10, 20)); 

        // Calls the three-integer version
        System.out.println("Sum of 3 ints: " + calc.sum(10, 20, 30)); 

        // Calls the two-double version
        System.out.println("Sum of 2 doubles: " + calc.sum(10.5, 20.5)); 
    }
}
