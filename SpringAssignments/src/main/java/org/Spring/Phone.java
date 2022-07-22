package org.Spring;

public class Phone {
    public String mob;

    public Phone(String mob){
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
