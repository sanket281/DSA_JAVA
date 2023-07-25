// Find the Factorial of a large number
//https://www.geeksforgeeks.org/factorial-large-number/

package Array;

public class array_problem11 {
    static void factorial(int n) {
        int a[] = new int[500];
        int asize = 1;
        a[0] = 1;
        int i;
        for (i = 1; i <= n; i++) {
            asize = multiply(i, a, asize);
        }
        System.out.println("Factorial of given number is ");
        for (int j = asize - 1; j >= 0; j--)
        {
            System.out.print(a[j]);
        }
    }

    static int multiply(int i, int a[], int asize) {
        int carry = 0;
        int prod;
        for (int j = 0; j < asize; j++) {
            prod = a[j] * i + carry;
            a[j] = prod % 10;
            carry = prod / 10;
        }
        while (carry != 0) {
            a[asize] = carry % 10;
            carry = carry / 10;
            asize++;
        }
        return asize;
    }

    public static void main(String args[]) {
        factorial(4);
    }
}
