package org.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Student {
    @Value("125787")
    private int id;
    @Value("Kevin Drake")
    private String name;
    private List<Phone> phones;
    @Autowired
    private Address address;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                ", address=" + address +
                '}';
    }
    public void print(){
        System.out.println(toString());
    }
}
