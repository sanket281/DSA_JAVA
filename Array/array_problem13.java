//Chocolate Distribution Problem
//https://www.geeksforgeeks.org/chocolate-distribution-problem/

package Array;

import java.util.Arrays;

public class array_problem13 {
    static void min_difference(int a[], int n, int m)
    {
        if(n==0 || m==0)
        {
            System.out.println("0");
        }
        if(n<m)
        {
             System.out.println("-1");
        }
        Arrays.sort(a);
        int min_diff = Integer.MAX_VALUE;
        for(int i=0;((i+m)-1)<n;i++)
        {
            min_diff = Math.min(min_diff, (a[(i+m)-1]-a[i]));
        }
        System.out.println("minimum difference is " + min_diff);
    }
    public static void main(String args[])
    {
        int a[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int n = a.length;
        int m = 7;
        min_difference(a,n,m);
    }
}
