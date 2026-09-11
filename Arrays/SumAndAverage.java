import java.util.Scanner;
class SumAndAverage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Print the elements of the array:");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        int sum = 0;
         for(int i=0; i<size; i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum of the elements of the array:"+ sum);

        double average = (double)sum/size;
        System.out.println("Average of the elements of the array:"+ average);
    }
}

