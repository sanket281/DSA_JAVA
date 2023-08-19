package Sorting;

public class merge_sort {
    static void divide(int a[], int low, int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid = low + (high-low)/2;
        divide(a,low,mid);
        divide(a,mid+1,high);
        conquer(a,low,mid,high);
    }
    static void conquer(int a[], int low, int mid, int high)
    {
        int temp[] = new int[1+high-low];
        int inx1 = low;
        int inx2 = mid+1;
        int count = 0;
        while(inx1<=mid && inx2<=high)
        {
            if(a[inx1]<=a[inx2])
            {

                temp[count++] = a[inx1++];
            }
            else
            {
                temp[count++] = a[inx2++];
            }
        }
        while(inx1<=mid)
        {
            temp[count++] = a[inx1++];
        }
        while(inx2<=high)
        {
            temp[count++] = a[inx2++];
        }
        for(int i=0, j=low; i<temp.length;i++,j++)
        {
            a[j] = temp[i];
        }
    }
    static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String args[])
    {
        int a[] = {8,7,6,5,6,7,3,4,5};
        int n = a.length;
        int high = n-1;
        int low = 0;
        divide(a,low,high);
        print(a);
    }
}
