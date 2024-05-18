package Encapsulation_L1;

import Inheritance_L2.Animal;

public class Student  {
    public static int noOfStudents;
    public String name;
    public int age;

    public Student() {
        name = "";
        age = 0;
        noOfStudents++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        noOfStudents++;
    }

    public void printStudent() {
        System.out.println("Student name is " + name + " and age is " + age);
    }
}


