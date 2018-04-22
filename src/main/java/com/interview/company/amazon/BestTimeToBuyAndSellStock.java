package com.interview.company.amazon;

//https://www.programcreek.com/2014/02/leetcode-best-time-to-buy-and-sell-stock-java/
//https://en.wikipedia.org/wiki/Maximum_subarray_problem
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
//https://leetcode.com/articles/best-time-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {

    public int maxProfit1(int[] prices) {
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

    //Approach #1 (Brute Force) [Time Limit Exceeded]
    public int maxProfit2(int prices[]) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }

    //Approach #2 (One Pass)
    public int maxProfit3(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

}
