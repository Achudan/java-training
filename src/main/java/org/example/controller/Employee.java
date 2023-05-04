package org.example.controller;

import java.util.Date;

public class Employee extends Person implements EmployeeRepo{
    private static Integer counter = 1;
    private Integer id;
    private Date joinDate;
    private String companyName = "Starbucks";

    public Employee(){
        super();
        this.id = counter++;
    }

    @Override
    public void displaySalary() {
        System.out.println("Salary is confidential");
    }

    public Employee(String fName, String lName, Integer age, Date joinDate){
        super( fName,  lName,  age);
        this.id = counter++;
        this.joinDate = joinDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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


    @Override
    public void displayCompanyName() {
        System.out.println("Company Name: "+this.companyName);
        System.out.println(EmployeeRepo.todayDate);
    }
}
