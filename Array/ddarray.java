//Program to make 2d array

package Array;
import java.util.Scanner;

public class ddarray {
public static void main(String args[]) {
    int n, m;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of Rows: ");
    n = sc.nextInt();
    System.out.println("----------------------------------------------------");
    System.out.println("Enter the no of Columns");
    m = sc.nextInt();
    int a[][] = new int[n][m];
    System.out.println("----------------------------------------------------"); 
    System.out.println("Enter the values: ");
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
        {
            a[i][j] = sc.nextInt();
        }
    }
    System.out.println("----------------------------------------------------");
    System.out.println("Your 2D array: ");
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
        {
            System.out.println(a[i][j]);
        }
    }
}    
}
