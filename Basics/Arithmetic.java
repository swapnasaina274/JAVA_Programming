import java.util.Scanner;
class Arithmetic
{
   public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);

        float num1, num2, sum, difference, product, average;

        System.out.print("Enter first number: ");
        num1 = sc.nextFloat();

        System.out.print("Enter second number: ");  
        num2 = sc.nextFloat();

        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        average = (num1 + num2) / 2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
   }
    
}