
public class Knapsack{

    static int knapsack(int[] wt, int[] val, int W, int n) {

        // Base condition
        if (n == 0 || W == 0) {
            return 0;
        }

        // Choice diagram
        if (wt[n - 1] <= W) {

            // Include the item
            int include = val[n - 1] +
                    knapsack(wt, val, W - wt[n - 1], n - 1);

            // Exclude the item
            int exclude = knapsack(wt, val, W, n - 1);

            // Return maximum profit
            return Math.max(include, exclude);
        }

        // Item cannot fit, so exclude it
        else {
            return knapsack(wt, val, W, n - 1);
        }
    }

    public static void main(String[] args) {

        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 4, 5, 7 };

        int W = 7;
        int n = wt.length;

        int maxProfit = knapsack(wt, val, W, n);

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
