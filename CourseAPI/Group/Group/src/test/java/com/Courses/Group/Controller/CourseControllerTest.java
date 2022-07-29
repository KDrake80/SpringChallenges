package com.Courses.Group.Controller;

import com.Courses.Group.Entity.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CourseControllerTest {
    @LocalServerPort
    private int port;
    @Autowired
    CourseController control;
    @Autowired
    TestRestTemplate test;

    @BeforeEach
    void setUp() {
    }
    @Test
    void contextLoads() throws Exception {
        assertThat(control).isNotNull();
    }
    @Test
    void welcome() {
        assertEquals( "<HTML><H1> Welcome to Course List \n Go to /courses to view all offered courses </H1></HTML>",
                control.welcome(), "Controller Test 1 Failed");
    }

    @Test
    void getAllCourses() {
        assertEquals(10, control.getAllCourses().size(), "Control test 2 Failed");
    }

    @Test
    void getCourseByID() {
        assertEquals("Lana Cane", control.getCourseByID("1").getInstructor(), "Test 3 Failed");
    }

    @Test
    void changeCourse() {
        Course c = control.getCourseByID("4");
        c.setCourseName("Biology");
        assertEquals("Biology", control.changeCourse(c).getCourseName(), "Test 4: Failed");
    }
}