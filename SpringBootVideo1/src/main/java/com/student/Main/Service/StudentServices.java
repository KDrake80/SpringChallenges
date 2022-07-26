package com.student.Main.Service;

import com.student.Main.Student.Student;

import java.util.List;

/**
 * Service Interface
 */
public interface StudentServices {

    List<Student> getAllStudents();
    Student getStudentByName(String name);
    Student changeStudent(Student student);
    Student addStudent(Student student);
    String deleteStudent(String name);
}
