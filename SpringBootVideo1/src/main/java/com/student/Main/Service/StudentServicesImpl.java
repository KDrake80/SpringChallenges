package com.student.Main.Service;

import com.student.Main.Student.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service Implementation
 */
@Service
public class StudentServicesImpl implements StudentServices {
    List<Student> list;

    public StudentServicesImpl() {
        list = new ArrayList<>();
        list.add(new Student("James Mineer", 89, 3.5, 18));
        list.add(new Student("Sarah Lynd", 100, 4.0, 17));
        list.add(new Student("Laura Croft", 76, 3.1, 18));
        list.add(new Student("Brian Adams", 85, 2.1, 16));
    }

    @Override
    public List<Student> getAllStudents() {
        return list;
    }

    @Override
    public Student getStudentByName(String name) {
        Student s = null;
        for (Student student:list) {
            if (student.getName().equals(name)){
                s = student;
                break;
            }
        }
        return s;
    }

    @Override
    public Student changeStudent(Student student) {
        int grade = student.getGrade();
        double gpa = student.getGpa();
        int age = student.getAge();
        Student s = null;
        for (Student li:list) {
            if (li.getName().equals(student.getName())){
                li.setAge(age);
                li.setGrade(grade);
                li.setGpa(gpa);
                s = li;
                break;
            }
        }
        return s;
    }

    @Override
    public Student addStudent(Student student) {
        list.add(student);
        return student;
    }

    @Override
    public String deleteStudent(String name) {
        Student s = null;
        for (Student student:list) {
            if (student.getName().equals(name)){
                list.remove(student);
                break;
            }
        }
        return "Deleted Successfully";
    }
}
