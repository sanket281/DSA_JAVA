//Find the Minimum element in a Sorted and Rotated Array
//https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/

package Array;
import java.util.*;

public class array_problem7 {
    public static void main(String args[])
    {
        List<Integer> v = new ArrayList<>(
            Arrays.asList(5,6,1,2,3,4));
            System.out.println("The Minimum element in the vector is: ");
           
            System.out.println(Collections.min(v));
        
    }
}
