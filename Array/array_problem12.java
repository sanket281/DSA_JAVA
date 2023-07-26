//Trapping Rain Water
//https://www.geeksforgeeks.org/trapping-rain-water/

package Array;

public class array_problem12 {
    static int a[] = new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    static void trap_water(int n)
    {
        int left[] = new int[n];
        int right[] = new int[n];
        int water = 0;
        left[0] = a[0];
        for(int i=1;i<n;i++)
        {
            left[i] = Math.max(left[i-1], a[i]);
        }
        right[n-1] = a[n-1];
        for(int j=n-2;j>=0;j--)
        {
            right[j] = Math.max(right[j+1], a[j]);
        }
        for(int k=0;k<n;k++)
        {
            water = water + (Math.min(left[k],right[k]) - a[k]);
        }
        System.out.println("The water trapped is equal to " + water);
    }
    public static void main(String args[])
    {
        int n = a.length;
        trap_water(n);
    }
}
