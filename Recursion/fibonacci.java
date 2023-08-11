package Recursion;

public class fibonacci {
    static int fibonacciNo(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return fibonacciNo(n-1) + fibonacciNo(n-2);
        }
    }
    public static void main(String args[])
    {
        int n = fibonacciNo(6);
        System.out.println(n);
    }
}
