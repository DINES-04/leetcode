class Solution {
    public int maxProfit(int[] prices) {
        // Valley-peak method (Greedy)
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] prices = {7, 1, 5, 3, 6, 4}; // Example test case
        int result = sol.maxProfit(prices);

        System.out.println("Maximum Profit: " + result); // Output: 7
    }
}
