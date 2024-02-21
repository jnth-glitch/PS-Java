package com.training;

public class EmployeeFactory {
 public static Employee getEmployee(String employeeType){
  if(employeeType.equalsIgnoreCase("Permanent"))
   return new Permanent(123,"Employee 1", 20000.0,(float)8);
  return new Temporary(123,"Temp1",8);
 }
}
