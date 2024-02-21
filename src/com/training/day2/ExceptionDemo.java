package com.training.day2;

import java.io.FileReader;
import java.security.spec.ECField;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String ...args){
        Scanner sc= new Scanner(System.in);
        Marathon m = new Marathon();
        boolean flag=true;
        while (flag) {
            //For Age
            try {
                System.out.println("Enter age");
                int age = Integer.parseInt(sc.next());
                flag = false;
                m.setAge(age);
            } catch (NumberFormatException e) {
                System.out.println("Enter age correctly!");
            }
        }
        flag= true;
        while (flag) {
            //For Gender
            try {
                System.out.println("Enter Gender (M or F)");
                String gender = sc.next();
                System.out.println(gender.length());
                if(!gender.equalsIgnoreCase("M") || !gender.equalsIgnoreCase("F") ){
                    throw new InputMismatchException("Enter either M or F");
                }
                flag = false;
                m.setGender(gender.charAt(0));
            } catch (Exception e) {
                System.out.println("Enter gender correctly!");
            }
        }

    }
}
