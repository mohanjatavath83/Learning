package com.learning.arrays;

public class IsLandPerimeter {

    static int perimete = 0;

    public static int getCellPerimeter(int[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length)
            return 0;

        int count = 0;

        if (col + 1 == grid[0].length || grid[row][col + 1] == 0)
            count++;

        if (row + 1 == grid.length || grid[row + 1][col] == 0)
            count++;

        if (row - 1 == -1 || grid[row - 1][col] == 0)
            count++;

        if (col - 1 == -1 || grid[row][col - 1] == 0)
            count++;


        return count;


    }

    /*public static void traversLand(int[][] land, int row, int col) {

        if (row < 0 || col < 0 || row >= land.length || col >= land[0].length || land[row][col] != 1)
            return;

        perimete += getCellPerimeter(land, row, col);
        land[row][col] = -1;
        traversLand(land, row, col + 1);
        traversLand(land, row + 1, col);
        traversLand(land, row - 1, col);
        traversLand(land, row, col - 1);

    }*/

    public int islandPerimeter(int[][] grid) {

        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter = perimeter + getCellPerimeter(grid, i, j);
                    grid[i][j] = -1;

                }
            }
        }

        return perimeter;


    }

    public static void main(String[] args) {

        //int[][] grid = {{1}};
         //int[][] grid =  {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int[][] grid = {{1, 0}};

        IsLandPerimeter isgridsPerimeter = new IsLandPerimeter();
        System.out.println(isgridsPerimeter.islandPerimeter(grid));

    }
}
