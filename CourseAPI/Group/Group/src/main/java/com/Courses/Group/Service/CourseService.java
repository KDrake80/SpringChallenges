package com.Courses.Group.Service;

import com.Courses.Group.Dao.CourseDao;
import com.Courses.Group.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseDao dao;

    public List<Course> getAllCourses(){
       return this.dao.findAll();
    }
    public Course getCourseById(int id){
        Optional<Course> o = this.dao.findById(id);
        Course c = null;
        if (o.isPresent())
            c = o.get();
        else
            throw new RuntimeException("Course not found for ID :: " + id);
        return c;
    }
    public Course changeCourse(Course course){
        return this.dao.save(course);
    }
    public Course addCourse(Course course){
        return this.dao.save(course);
    }
    public String deleteCourse(int id){
        this.dao.deleteById(id);
        return "Deleted Successfully";
    }
}
