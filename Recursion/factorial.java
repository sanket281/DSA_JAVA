package Recursion;

public class factorial {
    static int factorial1(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n*factorial1(n-1);
    }
    public static void main(String args[])
    {
        int n = factorial1(5);
        System.out.println(n);
    }
}
