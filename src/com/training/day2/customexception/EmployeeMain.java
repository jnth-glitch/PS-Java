package com.training.day2.customexception;

public class EmployeeMain {
    public static void main(String[] args) {
        try {
            // Valid case
            Employee emp1 = new Employee("Emp1", 5000);
            System.out.println("Employee 1 created successfully");

            // Invalid
            Employee emp2 = new Employee("Emp2", 7500);
            System.out.println("Employee 2 created successfully");
        } catch (InvalidSalaryException e) {
            System.out.println("Error creating employee: " + e.getMessage());
        }
    }

}
