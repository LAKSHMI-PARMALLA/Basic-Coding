import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c = x + y;
        System.out.println("Sum of two numbers is " +c);
    }
}
