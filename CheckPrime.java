import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any number");
      int a = sc.nextInt();
      boolean flag = false;
      for(int i = 2; i <= a/2; ++i) {
          if(a % i == 0)
          {
              flag = true;
          }
      }
      if(!flag){
          System.out.println(a+" is a prime number");
      }
      else {
          System.out.println(a+" is not a prime number");
      }
    }
}
 