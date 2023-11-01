import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int rem;
        double sum = 0;
        while(num>0)
        {
            rem = num % 10;
            sum += Math.pow(rem,3);
            num =  num / 10;
        }
        if(sum == temp)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not an armstrong number");
        }
    }
}
