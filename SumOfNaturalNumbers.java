import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void  main(String[] args)
    {
        //sum of n natural numbers formula: (n*(n+1))/2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = (n*(n+1))/2;
        System.out.println("Sum of numbers upto "+n+" is: " +sum);
    }
}
