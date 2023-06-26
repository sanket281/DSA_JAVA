//program to insert element in the array at the specified index

package Array;
import java.util.Scanner;

public class array_creation {
public static void main(String args[])    
{
    int n, p, q;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements in array:");
    n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n+1];
    System.out.println("----------------------------------------------------");
    System.out.println("Enter values: ");
    for(int i=0; i<n; i++)
    {
        a[i] = sc.nextInt();
    }
    System.out.println("----------------------------------------------------");
    System.out.println("Enter the index you want to add new value: ");
    p = sc.nextInt();
    System.out.println("----------------------------------------------------");
    System.out.println("Enter the new value: ");
    q = sc.nextInt();
    for(int i=0; i<n+1; i++)
    {
        if(i<p){
            b[i] = a[i];
        }
        else if(i == p){
            b[i] = q;
        }
        else{
            b[i] = a[i-1];
        } 
    }
    System.out.println("----------------------------------------------------");
    System.out.println("The elements are: ");
    for(int i=0; i<n+1; i++)
    {
        System.out.println(b[i]);
    }

}
}
