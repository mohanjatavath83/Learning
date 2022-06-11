package com.learning.oops;

public class Student {

    private int id;
    private String name;
    private String collegeName;


    public Student() {
        this.collegeName = "MIT";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public Student(int id, String name, String collegeName) {
        this.id = id;
        this.name = name;
        this.collegeName = collegeName;
    }


    public void setId(int id1) {
        id = id1;
    }


    public int getId() {
        return id;
    }

    public void setName(String name1) {
        name = name1;

    }

    public String getName() {
        return name;
    }

    public void setCollegeName(String collegeName1) {
        collegeName = collegeName1;

    }

    public String getCollegeName() {
        return collegeName;
    }
}
