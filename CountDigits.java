import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int a = sc.nextInt();
       int temp = a;
       int numOfDigits = 0;
       while(a != 0)
       {
           a = a/10;
           numOfDigits++;
       }
        System.out.println("Number of digits in "+temp+" is " +numOfDigits);
    }
}
