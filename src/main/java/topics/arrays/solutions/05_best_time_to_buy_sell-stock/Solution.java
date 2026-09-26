package topics.arrays.solutions.05_best_time_to_buy_sell-stock;

import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        // Track the minimum price seen so far
        int minPrice = Integer.MAX_VALUE;
        // Track the maximum profit
        int maxProfit = 0;

        // Iterate through each price
        for (int price : prices) {
            // Update minPrice if current price is lower
            if (price < minPrice) {
                minPrice = price;
            }
            // Update maxProfit if selling today is better
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}