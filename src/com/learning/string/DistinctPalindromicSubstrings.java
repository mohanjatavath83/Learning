package com.learning.string;

import java.util.HashSet;
import java.util.Set;

public class DistinctPalindromicSubstrings {


    public static Set<String> getDistinctPalindromicSubstrings(String str) {
        char[] array = str.toCharArray();
        Set<String> palindromes = new HashSet<>();

        int[][] dp = new int[array.length][array.length];

        int maxLength = 1;
        int start = 0;
        int end = 0;

        for (int i = 0; i < array.length; i++) {
            dp[i][i] = 1;
            palindromes.add(String.valueOf(array, i, 1));
        }

        for (int i = 0; i < array.length - 1; i++)
            if (array[i] == array[i + 1]) {
                palindromes.add(String.valueOf(array, i, 2));
                dp[i][i + 1] = 1;
                maxLength = 2;
                start = i;
                end = i + 1;

            }

        for (int c = 2; c < array.length; c++) {
            int j = c;
            for (int i = 0; j < array.length; i++, j++) {
                if (dp[i + 1][j - 1] == 1 && array[i] == array[j]) {
                    dp[i][j] = 1;

                    if (maxLength < j - i + 1) {
                        start = i;
                        end = j;

                        maxLength = j - i + 1;
                    }

                    palindromes.add(String.valueOf(array, i, j - i + 1));
                }
            }

        }


        return palindromes;

    }


    public static void main(String[] args) {

        String str = "geek";
       // String str = "abaaa";
        System.out.println(getDistinctPalindromicSubstrings(str));
    }
}
