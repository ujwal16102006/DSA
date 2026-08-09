class Solution {
    public double minPrice(int[] prices, int[] discounts) {
         Arrays.sort(prices);
        Arrays.sort(discounts);
        int n = prices.length;
        int m = discounts.length;
        double ans = 0;
        for (int i = 0; i < n; i++) {
            if (i < m) {
                ans += prices[n - 1 - i]
                        * (100.0 - discounts[m - 1 - i]) / 100.0;
            } else {
                ans += prices[n - 1 - i];
            }
        }
        return ans;
    }
}