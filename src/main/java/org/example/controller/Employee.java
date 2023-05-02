package org.example.controller;

import java.util.Date;

public class Employee {
    private static Integer counter = 1;
    private Integer id;
    private String fName;
    private String lName;
    private Integer age;
    private Date joinDate;

    public Employee(){
        this.id = counter++;
    }

    public Employee(String fName, String lName, Integer age, Date joinDate){
        this.id = counter++;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.joinDate = joinDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public void display(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Employee Id: " + this.getId());
        System.out.println("Name: " + this.getfName() + " " + this.getlName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Join Date: " + this.getJoinDate());
    }


}
