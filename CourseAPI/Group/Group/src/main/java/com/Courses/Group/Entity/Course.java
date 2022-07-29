package com.Courses.Group.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_courses")
public class Course {
    @Id
    @Column(name = "col_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int ID;
    private String instructor;
    private String courseName;
    private int studCount;
    private int studTotal;
    private double credits;

    public Course() {
    }
    public Course(int ID, String instructor, String courseName, int studCount, int studTotal, double credits) {
        this.ID = ID;
        this.instructor = instructor;
        this.courseName = courseName;
        this.studCount = studCount;
        this.studTotal = studTotal;
        this.credits = credits;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getStudCount() {
        return studCount;
    }

    public void setStudCount(int studCount) {
        this.studCount = studCount;
    }

    public int getStudTotal() {
        return studTotal;
    }

    public void setStudTotal(int studTotal) {
        this.studTotal = studTotal;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

}
