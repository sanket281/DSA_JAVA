//Search an element in a sorted and rotated Array
//https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/

package Array;

public class array_problem8 {
    static int search_key(int a[], int n, int key)
    {
        int mid;
        int high = n-1;
        int low = 0;
        while(low<=high)
        {
            mid = (high+low)/2;
            if(a[mid] == key)
            {
                return mid;
            }
            if(a[low] <= a[mid])
            {
                if(a[low]<=key && key<=a[mid])
                {
                    high = mid-1;
                }
                else
                {
                    low = mid+1;
                }
            }
            else
            {
                if(a[mid]<=key && key<=a[high])
                {
                    low = mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        int n = a.length;
        System.out.println("The key is at the the index:" + search_key(a,n, key));
    }
    
}
