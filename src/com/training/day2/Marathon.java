package com.training.day2;

public class Marathon {
    private String name;


    private int age;
    private char gender;
    private long contactNo;

    public Marathon(){}
    public Marathon(String name, int age, char gender, long contactNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNo = contactNo;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }
    @Override
    public String toString(){

        return "Name:" + this.name+"\nAge: "+ this.age+"\nNumber: "+this.contactNo+ "\nGender : "+ this.gender;
    }

}
