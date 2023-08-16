
class Solution {
    public static int stockBuyAndSell(int n, int[] prices) {
        // code here
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            // If the current price is greater than the previous day's price,
            // then consider buying on the previous day and selling on the current day.
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
}
