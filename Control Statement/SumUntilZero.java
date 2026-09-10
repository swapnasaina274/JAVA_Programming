import java.util.Scanner;

class SumUntilZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int number;
        System.out.println("Enter numbers to sum (enter 0 to stop):");
        
       do {
            number = sc.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("The sum of the entered numbers is: " + sum);
    }
}