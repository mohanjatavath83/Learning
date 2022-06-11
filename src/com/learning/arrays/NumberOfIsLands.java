package com.learning.arrays;

public class NumberOfIsLands {

    static int max = 0;

    public static void traversLand(int[][] land, int row, int col) {

        if (row < 0 || col < 0 || row >= land.length || col >= land[0].length || land[row][col] != 1)
            return;

        land[row][col] = 0;
        max++;
        traversLand(land, row, col + 1);
        traversLand(land, row + 1, col);
        traversLand(land, row - 1, col);
        traversLand(land, row, col - 1);

    }

    public static void main(String[] args) {

        int[][] land = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };


        int count = 0;
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (land[i][j] == 1) {
                    traversLand(land, i, j);
                    count++;
                    System.out.println(max);
                    max = 0;
                }
            }
        }

        //System.out.println(count);


    }
}
