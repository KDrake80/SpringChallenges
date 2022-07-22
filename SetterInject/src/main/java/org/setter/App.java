package org.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Kevin Drake
 * Setter Injection
 * Assignment 1
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("setter.xml");

        Student obj = (Student) context.getBean("Student");
        obj.print();
    }
}
