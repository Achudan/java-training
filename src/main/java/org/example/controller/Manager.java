package org.example.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Manager extends Employee{
    private String department;
    private List<Employee> reportingEmployees = new ArrayList<>();

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

    public List<Employee> getReportingEmployees() {
        return reportingEmployees;
    }

    public void addReportingEmployees(Employee reportingEmployee) {
        this.reportingEmployees.add(reportingEmployee);
    }

    public void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("");
    }

    public void displayReportingEmployees(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("The employees reporting under the manager " + this.getfName() + " " + this.getlName() + " are ");
        for(Employee emp: this.reportingEmployees){
            Developer dev = (Developer) emp;
            dev.display();
        }
    }

}
