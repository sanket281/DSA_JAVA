package Array;

public class array_problem15 {
    static void rotate(int a[], int d)
    {
        int n = a.length;
        int b[] = new int[n];
      
        for(int i=0;i<n;i++)
        {
            int newIndex = (i + d)%n;
            b[newIndex] = a[i];
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(b[j] + " ");
        }
    }
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6,7,8};
        int d = 3;
        rotate(a,d);
    }
}


