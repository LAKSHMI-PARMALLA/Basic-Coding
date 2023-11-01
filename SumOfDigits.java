import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number having greater than one digit");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0, digit;
        while(n>0)
        {
          digit = n % 10;
          sum = sum + digit;
          n = n /10;
        }
        System.out.println("Sum of digits of " +temp+ " is "+sum);
    }
}
