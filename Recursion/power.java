package Recursion;

public class power {
    static int powerNo(int a, int b)
    {
        if(b==1)
        {
            return a;
        }
        return a*powerNo(a, b-1);
    }
    public static void main(String args[])
    {
        int n = powerNo(3,2);
        System.out.println(n);
    }
}
