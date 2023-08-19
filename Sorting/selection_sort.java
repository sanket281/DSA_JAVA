package Sorting;

public class selection_sort {
    static void sort(int a[], int n)
    {
        int i,j,min,temp;
        for(i=0;i<n;i++)
        {
            min = i;
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min = j;
                    temp = a[i];
                    a[i] = a[min];
                    a[min] = temp;
                }
            }
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
    public static void main(String args[])
    {
        int a[] = {8,7,6,5,6,7,3,4,5};
        int n = a.length;
        sort(a,n);
    }
}
