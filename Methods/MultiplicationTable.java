public class MultiplicationTable {

    // Method to print the multiplication table
    public static void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        int num = 5;
        printTable(num);
    }
}
