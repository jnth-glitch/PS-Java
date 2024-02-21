package com.training.day2;

import java.util.Scanner;

public class LambdaDemo {
    public static void main(String ... args){
        MyFunctionalInterface obj= (a)-> a%2==0?  "Even":  "Odd";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =sc.nextInt();
        System.out.println(obj.oddOrEven(num));
    }

}
