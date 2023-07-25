//Container with Most Water
//https://www.geeksforgeeks.org/container-with-most-water/

package Array;

public class array_problem10 {
    static void max_area(int a[], int n)
    {
        int s = 0;
        int e = n-1;
        int area = 0; 
        while(s<e)
        {
            area = Math.max(area, Math.min(a[s], a[e])*(e-s));
            if(a[s]<a[e])
            {
                s = s+1;
            }
            else
            {
                e = e+1;
            }
        }
        System.out.println("The max area of water:" + area);
    }
    public static void main(String args[])
    {
        int a[] = {3, 1, 2, 4, 5};
        int n = a.length;
        max_area(a,n);
    }
    
}
