package org.example.controller;

import java.util.Date;

public class Developer extends Employee{
    private String[] skills;
    private Manager reportingManager;

    public Developer(String fName, String lName, Integer age, Date joinDate, String[] skills, Manager reportingManager){
        super(fName, lName, age, joinDate);
        this.skills = skills;
        this.reportingManager = reportingManager;
        this.reportingManager.addReportingEmployees(this);
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public Manager getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(Manager reportingManager) {
        this.reportingManager = reportingManager;
    }

    public void display() {
        super.display();
        System.out.print("Reporting Manager: "+this.getReportingManager().getfName()+ " " + this.getReportingManager().getlName() + "\n");
        System.out.print("Department: ");
        for(String skill: skills){
            System.out.print(skill+",");
        }
        System.out.println("");
    }

}
