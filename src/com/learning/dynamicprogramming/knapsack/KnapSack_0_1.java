package com.learning.dynamicprogramming.knapsack;

import java.util.HashMap;

public class KnapSack_0_1 {


    int knapsack(int[] wt, int[] val, int w, int i) {


        if (i < 0 || w <= 0)
            return 0;
        else if (wt[i] > w)
            return knapsack(wt, val, w, i - 1);
        else {
            int exclProfit = knapsack(wt, val, w, i - 1);
            int inclProfit = val[i] + knapsack(wt, val, w - wt[i], i - 1);

            return exclProfit > inclProfit ? exclProfit : inclProfit;
        }
    }


    int knapsack(int[] wt, int[] val, int w, int i, int[][] dp) {

        if (i < 0 || w <= 0)
            return 0;
        else if (dp[i][w] != 0)
            return dp[i][w];
        else if (wt[i] > w) {
            dp[i][w] = knapsack(wt, val, w, i - 1, dp);
            return dp[i][w];
        } else {
            int exclProfit = knapsack(wt, val, w, i - 1, dp);
            int inclProfit = val[i] + knapsack(wt, val, w - wt[i], i - 1, dp);

            dp[i][w] = exclProfit > inclProfit ? exclProfit : inclProfit;

            return dp[i][w];

        }
    }


    private int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    void knapsackDP(int[] wt, int[] val, int W) {


        int[][] table = new int[wt.length + 1][W + 1];


        for (int n = 0; n <= wt.length; n++) {
            table[n][0] = 0;
        }

        for (int w = 0; w <= W; w++) {
            table[0][w] = 0;
        }


        for (int n = 1; n <= wt.length; n++)
        {
            for (int w = 1; w <= W; w++)
            {
                if (wt[n - 1] > w)
                {
                    table[n][w] = table[n - 1][w];
                } else {
                    table[n][w] = max(val[n-1] + table[n - 1][w - wt[n - 1]], table[n][w]);
                }
            }
        }

        System.out.println("max profit " + table[wt.length][W]);

    }


    public static void main(String[] args) {
        KnapSack_0_1 ks = new KnapSack_0_1();
        /*int[] wt = {3, 4, 6, 5};
        int val[] = {2, 3, 1, 4};

        int w = 8;

        int[][] dp = new int[wt.length][w + 1];

        System.out.println(ks.knapsack(wt, val, w, wt.length - 1, dp));*/



        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int W = 50;

        ks.knapsackDP(wt, val, W);

        HashMap map = new HashMap();
        map.put(10,10);
    }
}
