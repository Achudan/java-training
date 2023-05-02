package org.example.controller;

import java.util.Date;

public class Developer extends Employee{
    private String[] skills;

    public Developer(String fName, String lName, Integer age, Date joinDate, String[] skills){
        super(fName, lName, age, joinDate);
        this.skills = skills;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public void display() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Name: " + this.getfName() + " " + this.getlName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Join Date: " + this.getJoinDate());
        System.out.print("Department: ");
        for(String skill: skills){
            System.out.print(skill+",");
        }
    }
}
