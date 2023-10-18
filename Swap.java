import java.util.Scanner;

public class Swap {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter First number");
     int a = sc.nextInt();
     System.out.println("Enter Second number");
     int b = sc.nextInt();
//     int c = a;
//     a = b;
//     b = c;
        a = a + b;
        b = a - b;
        a = a - b;
     System.out.println("After swapping " +a +" "+b);
    }
}
