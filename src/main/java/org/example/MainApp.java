package org.example;

import org.example.controller.Developer;
import org.example.controller.Manager;

import java.util.Date;

public class MainApp {
    public static void main(String... args){
        System.out.println("Main application");

        Manager em1 = new Manager("John", "Doe", 35, new Date("12/5/2010"), "Sales");
        Manager em2 = new Manager("Alice", "Smith", 42, new Date("1/10/2015"), "Marketing");
        Manager em3 = new Manager("Bob", "Johnson", 28, new Date("7/5/2017"), "Finance");


        Developer dev1 = new Developer("Johnny", "Deep", 28, new Date("7/5/2017"), new String[]{"Java", "Python", "SQL"}, em1);
        Developer dev2 = new Developer("Jane", "Smith", 32, new Date("2/17/2016"), new String[]{"C++", "PHP", "JavaScript"}, em2);
        Developer dev3 = new Developer("David", "Lee", 25, new Date("9/21/2018"), new String[]{"HTML", "CSS", "jQuery"}, em3);
        Developer dev4 = new Developer("Alice", "Johnson", 29, new Date("6/2/2015"), new String[]{"AngularJS", "React", "Node.js"}, em2);
        Developer dev5 = new Developer("Bob", "Williams", 31, new Date("4/14/2019"), new String[]{"Ruby", "Rails", "PostgreSQL"}, em2);
        Developer dev6 = new Developer("Samantha", "Taylor", 27, new Date("12/9/2014"), new String[]{"Swift", "Objective-C", "iOS"}, em3);
        Developer dev7 = new Developer("Michael", "Brown", 30, new Date("11/26/2016"), new String[]{"Android", "Kotlin", "Firebase"}, em3);
        Developer dev8 = new Developer("Karen", "Davis", 26, new Date("1/1/2018"), new String[]{"MongoDB", "Express", "Node.js"}, em3);
        Developer dev9 = new Developer("Kevin", "Clark", 33, new Date("8/8/2015"), new String[]{"TensorFlow", "PyTorch", "Deep Learning"}, em1);
        Developer dev10 = new Developer("Lisa", "Garcia", 24, new Date("3/7/2019"), new String[]{"HTML", "CSS", "JavaScript"}, em1);

        em1.displayReportingEmployees();

        em1.displayCompanyName();

        em1.displaySalary();



    }

}

