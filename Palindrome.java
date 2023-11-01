import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int temp = a;
        int r, sum=0;
        while(a>0)
        {
           r = a% 10;
           sum = (sum * 10)+ r;
           a = a/10;
        }
        if(temp == sum)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a palindrome number");
        }
    }
}
