// Check if pair with given Sum exists in Array
//https://www.geeksforgeeks.org/check-if-pair-with-given-sum-exists-in-array/
package Array;

public class array_problem1 {
    static boolean checkArray(int a[], int n, int size)
    {
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++ )
            {
                if(a[i]+a[j] == n)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        
        int a[] = {0,1,2,3,4,5};
        int n = 9;
        int size = a.length;
        if(checkArray(a, n, size))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
      
    }
}

