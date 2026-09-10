import java.util.Scanner;

class SearchElement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {12, 45, 67, 23, 89, 34};
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) 
        {
            if (numbers[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break; // Exit the loop immediately once target is found
            }
        }
        if(!found) {
            System.out.println("Element not found in the array.");
        } 
    }

}
