//Best Time to Buy and Sell Stock
//https://www.geeksforgeeks.org/check-if-pair-with-given-sum-exists-in-array/

package Array;

public class array_problem2 {
    static int find_max(int prices[], int n)
    {
        int buy = prices[0];
        int max_profit = 0;
        for(int i=1; i<n; i++)
        {
            if(buy > prices[i])
            {
                buy = prices[i];
            }
            else if(prices[i] - buy > max_profit)
            {
                max_profit = prices[i] - buy;
            }
        }
        return max_profit;
    }

    public static void main(String args[])
    {
        int prices[] = {7,1,5,3,6,4};
        int size = prices.length;
        int max_profit = find_max(prices, size);
        System.out.println(max_profit);
    }
}
