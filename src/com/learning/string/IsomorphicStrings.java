package com.learning.string;

public class IsomorphicStrings {


    public static boolean areIsomorphic(String str1, String str2) {


        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        int[] fcount1 = new int[26];
        int[] fcount2 = new int[26];


        for (int i = 0; i < arr1.length; i++) {
            System.out.println((int) arr1[i]);
            if (arr1[i] >= 65 && arr1[i] <= 90) {
                fcount1[arr1[i] - 65]++;
            } else {
                fcount1[arr1[i] - 97]++;
            }
        }

        System.out.println(fcount1);


        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] >= 65 && arr2[i] <= 90) {
                fcount2[arr2[i] - 65]++;
            } else {
                fcount2[arr2[i] - 97]++;
            }
        }

        System.out.println(fcount2);


        for (int i = 0; i < fcount1.length; i++) {
            System.out.println(fcount1[i] + "  " + fcount2[i]);
            if (fcount1[i] != fcount2[i])
                return false;
        }


        return true;

    }

    public static void main(String[] args) {

        String str1 = "aab";
        String str2 = "xxy";

        System.out.println(areIsomorphic(str1, str2));


    }
}
