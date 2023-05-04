package org.example.controller;

import java.util.Date;

public abstract class Person {
    private String fName;
    private String lName;
    private Integer age;

    public Person(String fName, String lName, Integer age){
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public Person() {

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public abstract void displaySalary();
}
