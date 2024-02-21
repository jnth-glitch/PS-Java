package com.training.day2.customexception;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) throws InvalidSalaryException {
        if (salary < 10000) {
            throw new InvalidSalaryException("Minimum salary must be 10000INR");
        }
        this.name = name;
        this.salary = salary;
    }

    // Getter and setter methods for name and salary
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary < 10000) {
            throw new InvalidSalaryException("Minimum salary must be 10000INR");
        }
        this.salary = salary;
    }
}
