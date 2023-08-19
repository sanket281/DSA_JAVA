package Sorting;

public class quick_sort {
    static int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        return i + 1;
    }

    static void sort(int a[], int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            sort(a, low, pi - 1);
            sort(a, pi + 1, high);
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
        sort(a,0,n-1);
        print(a);
    }
}
