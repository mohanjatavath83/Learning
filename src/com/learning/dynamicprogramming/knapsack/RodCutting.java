package com.learning.dynamicprogramming.knapsack;

public class RodCutting {


    public int rc(int[] length, int[] profit, int m, int index) {

        if (index >= length.length || m == 0)
            return 0;

        else if (length[index] > m)
            return rc(length, profit, m, index + 1);

        return Math.max(rc(length, profit, m - length[index], index) + profit[index], rc(length, profit, m, index + 1));
    }

    public int rc(int[] length, int[] profit, int m, int index, int dp[][]) {

        if (index >= length.length || m < 0)
            return 0;

        if (dp[index][m] != 0) {
            System.out.println(index + " " + m);
            return dp[index][m];
        } else if (length[index] > m)
            return dp[index][m] = rc(length, profit, m, index + 1);

        dp[index][m] = Math.max(rc(length, profit, m - length[index], index, dp) + profit[index], rc(length, profit, m, index + 1, dp));

        return dp[index][m];
    }

    public int minCost(int n, int[] cuts, int index, int[][] dp) {

        if (index >= cuts.length || n < 0)
            return 0;

        else if (dp[index][n] != 0)
            return dp[index][n];

        dp[index][n] = Math.min(minCost(n - index+1, cuts, index, dp) + cuts[index], minCost(n, cuts, index + 1, dp));

        return dp[index][n];
    }


    public int minCost(int n, int[] cuts) {

        int dp[][] = new int[cuts.length][n + 1];

        return minCost(n, cuts, 0, dp);


    }


    public static void main(String[] args) {

        int[] profit = {1, 5, 8, 9, 10, 17, 17, 20};
        int[] length = {1, 2, 3, 4, 5, 6, 7, 8};
        int m = 8;
        int[][] dp = new int[profit.length][m + 1];
        RodCutting rc = new RodCutting();
        //System.out.println(rc.rc(length, profit, 8, 0, dp));

        System.out.println(rc.minCost(m, profit));
    }
}
