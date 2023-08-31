// Best Time to Buy and Sell Stock
// Easy
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

// Example 2:

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.


class BuySell {
    public int maxProfit(int[] prices) {
        int left = 0; // left pointer (buy)
        int right = 1; // right pointer (sell)
        int maxProfit = 0;

        while(right < prices.length){
            // Check if transaction is profitable
            if(prices[right] > prices[left]){
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            }else {
                // Right pointer is now the cheapest price -> asign to left pointer
                left = right;   
            }
            right++;
        }

        return maxProfit;
    }
}


// Runtime: 1 ms
// Memory: 61.7 MB