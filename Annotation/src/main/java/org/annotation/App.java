package org.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Kevin Drake
 * Annotation Config
 * Assignment 1
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student stu = (Student)context.getBean(Student.class);
        stu.print();
    }
}
