package com.student.Main.Controller;

import com.student.Main.Service.StudentServicesImpl;
import com.student.Main.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller Class
 */
@RestController
public class StudentController {
    @Autowired
    private StudentServicesImpl services;
    @GetMapping("/")
    public String welcome(){
        return "<HTML><H1> Welcome to Assignment 1</H1></HTML>";
    }
    @GetMapping("/Students")
    public List<Student> getAllStudents(){
        return this.services.getAllStudents();
    }

    @GetMapping("/Students/{name}")
    public Student getStudent(@PathVariable String name){
        return this.services.getStudentByName(name);
    }
    @PostMapping("/Students")
    public Student addStudent(@RequestBody Student student){
        return this.services.addStudent(student);
    }
    @PutMapping("/Students")
    public Student changeStudent(@RequestBody Student student){
        return this.services.changeStudent(student);
    }
    @DeleteMapping("/Students/{name}")
    public String deleteStudent(@PathVariable String name){
        return this.services.deleteStudent(name);
    }

}
