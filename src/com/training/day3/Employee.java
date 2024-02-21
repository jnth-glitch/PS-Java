package com.training.day3;

import java.util.Objects;

public class Employee {
    private long empId;



    private String empName;



    private double salary;

    public Employee(long empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }


    // Getter and setter methods for name and salary
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int compareTo(Employee o){
        return (int) (this.salary-o.salary);
    }
}
