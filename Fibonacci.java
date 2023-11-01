public class Fibonacci {
    public static void main(String[] args)
    {
        int a=0;
        int b=1;
        int fib;
        System.out.print(a+" "+b);
        for(int i=0; i<10; i++)
        {
            fib=a+b;
            System.out.print(" "+fib);
            a=b;
            b=fib;
        }
    }
}
