import java.util.Scanner;
class LargestSmallest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("Display the elements of the array:");
        for(int i=0; i<size; i++)
        {
            System.out.print(array[i]+" ");
        }

        // Find the largest and smallest elements in the array
        int largest = array[0];
        int smallest = array[0];

        for(int i=1; i<size; i++)
        {
            if(array[i] > largest)
            {
                largest = array[i];
            }
            else if(array[i] < smallest)
            {
                smallest = array[i];
            }
        }
        System.out.println();
        System.out.println("Largest element in the array: " + largest);
        System.out.println("Smallest element in the array: " + smallest);
    }
}