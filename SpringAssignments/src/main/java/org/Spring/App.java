package org.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Kevin Drake
 * Main class to run the App
 * Assignment 1: Constructor Injection
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjection.xml");
        Student student = (Student) context.getBean("Student");
        student.print();
    }
}
