package Sorting;

public class insertion_sort {
    static void sort(int a[], int n)
    {
        int i,j,key;
        for(i=1;i<n;i++)
        {
            key = a[i];
            j = i-1;
            while(j>=0 && a[j]>key)
            {
                    a[j+1] = a[j];
                    j--;
            }
            a[j+1] = key;

        }
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k] + " ");
        }
    }
    public static void main(String args[])
    {
        int a[] = {8,7,6,5,6,7,3,4,5};
        int n = a.length;
        sort(a,n);
    }
}
