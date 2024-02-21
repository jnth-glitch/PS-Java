package com.training;

public abstract class Bank {
    private String bankId;
    private String bankName;
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public float getYears() {
        return years;
    }

    public void setYears(float years) {
        this.years = years;
    }

    public Bank(double amount, float years) {
        this.amount = amount;
        this.years = years;
    }

    private double amount;
    private float years;


    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }


    public abstract double getMaturityAmount();
    public Bank(){}

}
