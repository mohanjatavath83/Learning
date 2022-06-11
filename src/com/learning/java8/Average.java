package com.learning.java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Average {


    public static void main(String[] args) {


        Student s1 = new Student(100d);
        Student s2 = new Student(100d);
        Student s3 = new Student(100d);

        List<Student> list = Arrays.asList(s1, s2);

        double average1 = list.stream().map(student -> student.score).collect(Collectors.averagingDouble(value -> value));
        double average2 = list.stream().mapToDouble(value ->value.score).average().getAsDouble();
        list.stream().mapToDouble(value -> value.score);
        System.out.println();

    }


    static class Student {
        double score;

        public String firstName;
        public String lastName;

        public Student(double score) {
            this.score = score;
        }




    }
}
