package com.learning.recusrion;

public class SubString {


    public static void subString(String output, char[] array, int index) {
        if (index == array.length) {
            System.out.println(output);
        } else {
            subString(output + array[index], array, index + 1);
            subString(output, array, index + 1);

        }
    }


    public static void main(String[] args) {

        char[] array = {'a','b','c'};

        subString("", array, 0);

    }
}
