package org.example.controller;

import java.util.Date;

public class Manager extends Employee{
    private String department;

    public Manager(String fName, String lName, Integer age, Date joinDate, String department){
        super(fName, lName, age, joinDate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void display() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Name: " + this.getfName() + " " + this.getlName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Join Date: " + this.getJoinDate());
        System.out.println("Department: " + department);
    }

}
