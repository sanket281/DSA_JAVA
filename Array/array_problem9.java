//Find all triplets with zero sum
//https://www.geeksforgeeks.org/find-triplets-array-whose-sum-equal-zero/

package Array;

import java.util.HashSet;

public class array_problem9 {
    static void findTriplets(int a[], int n)
    {
        boolean found = true;
        for(int i = 0; i<n-1; i++)
        {
            HashSet<Integer> s = new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int x = -(a[i]+a[j]);
                if(s.contains(x))
                {
                    System.out.println(x + " " + a[i] + " " + a[j]);
                    found = true;
                }
                else
                {
                    s.add(a[j]);
                }
            } 
        }
        if(found == false)
        {
            System.out.println("No Triplet found");
        }
    }
    public static void main(String args[])
    {
        int a[] = {0, -1, 2, -3, 1 };
        int n = a.length;
        findTriplets(a,n);
    }
}
