package com.training;

public class Permanent implements Employee{
    public Permanent(int empID, String name,double baseSalary, float noOfHoursWorked) {
        this.baseSalary = baseSalary;
        this.noOfHoursWorked = noOfHoursWorked;
        this.empID = empID;
        this.name = name;
    }

    private double baseSalary;
    private float noOfHoursWorked;

    private int empID;
    private String name;
    private double salary;
    public void setSalary(){
        this.salary=baseSalary + 40*noOfHoursWorked;
    }
    public double getSalary(){
        setSalary();
        return salary;
    }
    @Override
    public String getEmpInfo(){
        return "Name : "+ this.name +"\nId: "+ this.empID+"\nType: permanent"+"\n Salary: "+this.salary;
    }
}
