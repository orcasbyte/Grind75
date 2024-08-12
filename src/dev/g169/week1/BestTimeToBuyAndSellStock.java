package dev.g169.week1;

/**
 * <h1>Best Time to Buy and Sell Stock</h1>
 * <p>
 * <span>🔗 Link:
 * </span><span>https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/</span>
 * </p>
 * <p>
 * <span>💪🏼 Difficulty: </span><strong style="color: green">Easy</strong>
 * </p>
 * <p>
 * <span>🏷️ Topics: </span><span>Array, Dynamic Programming</span>
 * </p>
 */
public class BestTimeToBuyAndSellStock {

    private static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < buyPrice)
                buyPrice = price;
            else {
                int profit = price - buyPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        System.out.println(maxProfit(prices));
    }

}
