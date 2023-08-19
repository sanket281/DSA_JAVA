package Sorting;

public class bubble_sort {
    static void sort(int a[], int n)
    {
        boolean current;
        int i,j,temp;
        for(i=0;i<n-1;i++)
        {
            current = false;
            for(j=0;j<(n-i)-1;j++)   
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    current = true;
                }
            
            }  
            if(current == false)
            {
                break;
            }
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
