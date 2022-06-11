package com.learning.dynamicprogramming.knapsack;

public class Coninchange {

    public int numberOfWays(int[] coins, int amount, int index) {
        if (amount == 0)
            return 1;
        if (index < 0 || amount < 0)
            return 0;

        return numberOfWays(coins, amount - coins[index], index) + numberOfWays(coins, amount, index - 1);

    }


    public int coinChange(int[] coins, int amount, int index) {
        if (amount == 0 || amount <= 0 || index < 0) {
            return 0;
        } else {

            if (amount < coins[index]) {
                return coinChange(coins, amount, index - 1);
            }

            return Math.min(coinChange(coins, amount, index - 1), 1 + coinChange(coins, amount - coins[index], index));
        }

    }


    /*public static void main(String[] args) {


        Coninchange coninchange = new Coninchange();
        int[] coins = {1, 2, 3, 4};
        int amount = 4;
        System.out.println(coninchange.numberOfWays(coins, amount, coins.length - 1));

    }*/


    static int count(int S[], int m, int n) {

        // If n is 0 then there is 1 solution
        // (do not include any coin)
        if (n == 0)
            return 1;

        // If n is less than 0 then no
        // solution exists
        if (n < 0)
            return 0;

        // If there are no coins and n
        // is greater than 0, then no
        // solution exist
        if (m <= 0 && n >= 1)
            return 0;

        // count is sum of solutions (i)
        // including S[m-1] (ii) excluding S[m-1]
        return count(S, m - 1, n) +
                count(S, m, n - S[m - 1]);
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        int m = arr.length;

        System.out.println(count(arr, m, 4));
    }

}
