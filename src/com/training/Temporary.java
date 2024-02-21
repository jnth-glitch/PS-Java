package com.training;

public class Temporary implements Employee{
    public Temporary(int empID, String name, float noOfHoursWorked) {
        this.noOfHoursWorked = noOfHoursWorked;
        this.empID = empID;
        this.name = name;
    }


    private float noOfHoursWorked;

    private int empID;
    private String name;
    private double salary;
    public void setSalary(){
        this.salary=40*noOfHoursWorked;
    }
    public double getSalary(){
        setSalary();
        return salary;
    }
    @Override
    public String getEmpInfo(){
        return "Name : "+ this.name +"\nId: "+ this.empID+"\nType: temporary"+"\n Salary: "+this.salary;
    }
}
