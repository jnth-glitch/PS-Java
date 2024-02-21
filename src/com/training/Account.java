package com.training;

public class Account {

    private int accountNumber;
    private double balance;
    private int accountHolderAge;

    public int getAccountHolderAge() {
        return accountHolderAge;
    }

    public void setAccountHolderAge(int accountHolderAge) {
        this.accountHolderAge = accountHolderAge;
    }

    public Account(){}
    public Account(int accountNumber, double balance,int accountHolderAge) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderAge=accountHolderAge;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }



    public String toString(){
    return "Account number: "+this.accountNumber +"\n Balance: " +this.balance;
}
public String deposit(double amnt){
        System.out.println(this);
        this.balance+=amnt;
        return "Available balance: "+this.balance;
}
public String withDraw(double amnt){
        if(amnt>this.balance){
            return "Insufficient Balance";
        }
        this.balance-=amnt;
    return "Available balance: "+this.balance;
}

}
