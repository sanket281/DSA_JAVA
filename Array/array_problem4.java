//Product of Array except itself
//https://www.geeksforgeeks.org/a-product-array-puzzle/

package Array;

public class array_problem4 {
    static void product_array(int a[], int n)
    {
        int prod[] = new int[n];
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = 1;
        right[n-1] = 1;
    
        for(int i=1;i<n; i++)
        {
           left[i] = left[i-1]*a[i-1];
        }
        for(int i=n-2;i>=0; i--)
        {
           right[i] = right[i+1]*a[i+1];
        }
        for(int i=0; i<n; i++)
        {
            prod[i] = left[i]*right[i];
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(prod[i] + " ");
        }
    }
    public static void main(String args[])
    {
        int a[] = {10, 3, 5, 6, 2};
        int n = a.length;
        product_array(a,n);
    }
}
