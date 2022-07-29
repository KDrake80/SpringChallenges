package com.Courses.Group.Controller;

import com.Courses.Group.Entity.Course;
import com.Courses.Group.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService service;
    @GetMapping("/")
    public String welcome(){
        return "<HTML><H1> Welcome to Course List \n Go to /courses to view all offered courses </H1></HTML>";
    }
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return this.service.getAllCourses();
    }
    @GetMapping("/courses/{ID}")
    public Course getCourseByID(@PathVariable String id){
        return this.service.getCourseById(Integer.parseInt(id));
    }
    @PostMapping("/courses")
    public Course changeCourse(@RequestBody Course course){
        return this.service.changeCourse(course);
    }
    @PutMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.service.addCourse(course);
    }
    @DeleteMapping("/courses/{ID}")
    public String deleteCourse(String id){
        return this.service.deleteCourse(Integer.parseInt(id));
    }
}
