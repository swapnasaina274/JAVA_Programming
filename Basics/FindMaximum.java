public class FindMaximum {
    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 25;

        // Ternary operator syntax: variable = (condition) ? value_if_true : value_if_false;
        int max = (number1 > number2) ? number1 : number2;

        System.out.println("The maximum of " + number1 + " and " + number2 + " is: " + max);
    }
}
