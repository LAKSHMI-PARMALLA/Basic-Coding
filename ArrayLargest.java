import java.util.Scanner;

public class ArrayLargest {
    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of array elements: ");
       int n = sc.nextInt();
       System.out.println("Enter array elements: ");
       int[] arr = new int[n];
       for(int i = 0; i<n; i++)
       {
           arr[i] = sc.nextInt();
       }
       int largest = arr[0];
       for(int num: arr)
       {
           if(largest < num)
           {
               largest = num;
           }
       }
        System.out.println("Largest number in the array: "+largest);
    }
}
