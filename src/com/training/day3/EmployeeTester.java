package com.training.day3;

import java.util.ArrayList;

public class EmployeeTester {
    public static void main(String ...args){
        ArrayList<Employee> emp= new ArrayList<>();
        emp.add(new Employee(123,"A",10000));
        emp.add(new Employee(124,"B",20000));
        emp.add(new Employee(125,"C",1000));
        //to find the max
        System.out.println((emp.stream().max(Employee::compareTo).get())+"AA");

    }
}
