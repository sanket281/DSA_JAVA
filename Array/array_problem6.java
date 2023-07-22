package Array;

public class array_problem6 {
    static void max_product(int a[])
    {
        int n = a.length;
        int mul = 1;
        int result = 1;
        for(int i=0;i<n;i++)
        {
            mul = a[i];
            if(i == n-1 && a[i]>result)
            {
                    result = a[i]; 
            }
            for(int j=i+1;j<n;j++)
            {
                mul = mul*a[j];
                if(result<mul)
                {
                    result = mul;
                }
            }
        }
        System.out.println("The max product is " + result);
    }
    public static void main(String args[])
    {
        int a[] = {6, -3, -10, 0, 2};
        max_product(a);
    }

}
