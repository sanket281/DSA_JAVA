//Program to delete element from the specified index in array

package Array;
import java.util.Scanner;

public class array_deletion {
public static void main(String args[]){

    int n, p;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array: ");       
    n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n-1];
     System.out.println("----------------------------------------------------");
    System.out.println("Enter the values of array: ");
    for(int i=0; i<n; i++)
    {
        a[i] = sc.nextInt();
    }
     System.out.println("----------------------------------------------------");
    System.out.println("enter the index from where you want to delete elements");
    p = sc.nextInt();
    System.out.println("----------------------------------------------------");
    for(int i=0; i<n; i++)
    {
        if(i<p)
        {
            b[i] = a[i];
            System.out.println(b[i]);
        }
        else if(i == p)
        {
            continue;
        }
        else
        {
            b[i] = a[i+1];
            System.out.println(b[i]);
        }
    }
}        

}
