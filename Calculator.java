import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b= sc.nextInt();
        System.out.println("Enter the operation you want to perform: +, -, *, /, %");
        String operation = sc.next();
        int result = performOperation(a, b, operation);
        System.out.println("Your answer is: "+result);
    }
    public static int performOperation(int a, int b, String operation)
    {
      int result = 0;
      switch(operation)
      {
          case "+":
              result = a + b;
              break;
          case "-":
              result = a - b;
              break;
          case "*":
              result = a * b;
              break;
          case "/":
              result = a / b;
              break;
          case "%":
              result = a % b;
              break;
          default:
              System.out.println("You have entered incorrect option");
              break;
      }
      return result;
    }
}
