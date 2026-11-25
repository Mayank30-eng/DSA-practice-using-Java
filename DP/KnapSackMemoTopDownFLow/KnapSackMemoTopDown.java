import java.util.Arrays;

class Knapsack {
    static int[][] dp;

    static int knapsack(int[] wt, int[] val, int W, int n) {

        // base condition
        if (W == 0 || n == 0) {
            return 0;
        }
        // check if answer already Exists
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        // choice digram
        if (wt[n - 1] <= W) {
            // include
            int include = val[n - 1] + knapsack(wt, val, W - wt[n - 1], n - 1);
            // exclude
            int exclude = knapsack(wt, val, W, n - 1);
            dp[n][W] = Math.max(include, exclude);
        } else {
            dp[n][W] = knapsack(wt, val, W, n - 1);

        }
        return dp[n][W];
    }

    public static void main(String[] args) {

        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 4, 5, 7 };

        int W = 7;
        int n = wt.length;

        dp = new int[n + 1][W + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int maxProfit = knapsack(wt, val, W, n);

        System.out.println("Maximum Profit: " + maxProfit);
    }

}
