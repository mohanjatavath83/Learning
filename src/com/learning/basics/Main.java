package com.learning.basics;

import com.learning.oops.Student;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student(10, "vinod");
        Student s2 = new Student(11, "rahul");
        Student s3 = new Student(12, "sushma");
        Student s5 = new Student(14, "sachin", "BIT");
        Student s4 = new Student();


        System.out.println(s1.getName());

        System.out.println(s5.getName());


    }
}
