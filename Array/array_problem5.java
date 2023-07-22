//Largest Sum Contiguous Subarray (Kadane’s Algorithm)
//https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

package Array;

public class array_problem5 {
    static void max_subarray(int a[])
    {
        int n = a.length;
        int max_ending = 0;
        int s = 0;
        int start = 0 ;
        int end = 0;
        int max_sofar = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max_ending = max_ending + a[i];
                  
            if(max_ending<0)
            {
                max_ending = 0;
                s = i + 1;

            }
            if(max_sofar<max_ending)
            {
                max_sofar = max_ending;
                start = s;
                end = i;
            }
        }
        System.out.println("Maximum sum of the subarray is " + max_sofar);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }
    public static void main(String args[])
    {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        max_subarray(a);
    }
}
