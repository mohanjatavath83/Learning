package com.learning.dynamicprogramming.knapsack;

public class UnboundedKnapSack {

    public int max(int a, int b) {
        return a > b ? a : b;
    }


    public int ks(int[] wt, int[] val, int index, int bagSize) {
        if (index <= 0 || bagSize <= 0)
            return 0;
        else if (wt[index] > bagSize)
            return ks(wt, val, index - 1, bagSize);
        else {
            return max(val[index] + ks(wt, val, index, bagSize - wt[index]), ks(wt, val, index - 1, bagSize));
        }


    }


    public static void main(String[] args) {

        UnboundedKnapSack unboundedKnapSack = new UnboundedKnapSack();

        int W = 100;
        int val[] = {10, 30, 20};
        int wt[] = {5, 10, 15};
        int n = val.length;
        System.out.println(unboundedKnapSack.ks(wt, val, n - 1, W));

    }
}
