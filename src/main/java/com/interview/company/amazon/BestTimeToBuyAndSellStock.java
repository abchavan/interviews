package com.interview.company.amazon;

//https://www.programcreek.com/2014/02/leetcode-best-time-to-buy-and-sell-stock-java/
//https://en.wikipedia.org/wiki/Maximum_subarray_problem
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        //Kadane's algorithm
        if (prices.length == 0) return 0;

        int max = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            } else {
                min = prices[i];
            }
        }
        return max;
    }
}
