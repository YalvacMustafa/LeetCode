/**
---BEST TIME TO BUY AND SELL STOCK---


You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 

Constraints:

<= prices.length <= 105
 <= prices[i] <= 104
*/
package leetcode.Example1;

public class Main {
    
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}

/**
 EXPLANATION

The idea is to keep track of the minimum price seen so far and 
the maximum profit that can be made by selling at the current price.
 We iterate through the array and update these values accordingly. 
 If we see a price lower than the current minimum, we update the minimum. 
 If we see a price higher than the current minimum, 
 we calculate the profit that can be made by selling at that price and update 
 the maximum profit if it is higher than the current value. At the end, we return the maximum profit.
 */