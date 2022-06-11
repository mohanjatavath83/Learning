package com.learning.dynamicprogramming.knapsack;

public class MinimumCoingChangeProblem {

    public int mc(int[] coins, int index, int m) {
        if (m == 0)
            return 0;
        if (index >= coins.length)
            return Integer.MAX_VALUE - 1;

        else if (coins[index] > m)
            return mc(coins, index + 1, m);
        else
            return Math.min(mc(coins, index, m - coins[index]) + 1, mc(coins, index + 1, m));


    }

    public static void main(String[] args) {

        int coins[] = {2, 2, 2, 2};
        int coins1[] = {25, 10, 5};
        int[] coins3 = {1, 3, 5, 7};
        int V1 = 30;
        int m = coins.length;
        int V = 11;
        int V3 = 18;

        MinimumCoingChangeProblem mc = new MinimumCoingChangeProblem();
        System.out.println(mc.mc(coins3, 0, V3));


    }
}
