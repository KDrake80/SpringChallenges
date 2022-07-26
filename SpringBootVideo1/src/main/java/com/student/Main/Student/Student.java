package com.student.Main.Student;

/**
 * Class to define the Student Object
 */
public class Student {
    private String name;
    private int grade;
    private double gpa;
    private int age;

    public Student() {
    }

    public Student(String name, int grade, double gpa, int age) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
