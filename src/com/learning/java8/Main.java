package com.learning.java8;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface Add<T> {
    T add(T num1, T nmu2);
}

class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

interface MyFunction<T, R> extends Function<T, R> {
}



class Student {
    private int age;
    private String name;
    private Address address;
    List<String> names = new ArrayList<>();


    public Student(int age, String name, Address address, List<String> names) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}

public class Main {

    public static void main(String[] args) {

        /*Predicate<Integer> predicate1 = num -> {
            return num % 2 == 0;
        };

        Predicate<Integer> predicate2 = num -> {
            return num > 4;
        };


        List<Integer> number2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers = number2.stream().filter(n -> n % 2 == 0).filter(n -> n > 4).collect(Collectors.toList());
        System.out.println(numbers);

        List<String> names = Arrays.asList("mohan", "sowmya", "bindiay", "suman123", "subhash");
        List<String> names1 = names.stream().filter(name -> name.startsWith("s")).filter(name -> name.length() > 6).collect(Collectors.toList());
        System.out.println(names1);
        List<Student> students = Arrays.asList(new Student(12, "mohan", new Address("BENG"), Arrays.asList("sowmya", "vinod")), new Student(13, "subhash", new Address("HYD"), Arrays.asList("sachin", "dhoni")), new Student(12, "bindiya", new Address("HYD"), Arrays.asList("virat", "rohith")));
        Optional<String> studentNames = students.stream().filter(student -> student.getAge() > 20).map(Student::getName).findAny();
        Set<String> cities = students.stream().map(student -> student.getAddress()).map(address -> address.getCity()).collect(Collectors.toSet());
        List<String> names2 = students.stream().flatMap(student -> student.getNames().stream()).collect(Collectors.toList());

        System.out.println(cities);
        System.out.println(names2);*/


        System.out.println(" Mohan Jatavath ".trim().length());




        List<Integer> number2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,3,7,8,5,9,1,3,5);

        System.out.println(number2.stream().collect(Collectors.toSet()));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,3,7,8,5,9,1,3,5};
        System.out.println(Arrays.asList(arr).stream().collect(Collectors.toSet()));








    }
}
