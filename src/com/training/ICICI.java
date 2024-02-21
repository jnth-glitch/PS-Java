package com.training;

public class ICICI extends Bank{


    private float rate;
    public ICICI(){}
    public ICICI(double amount, float years) {
        super(amount,years);
        this.rate=(float)5;
    }
    @Override
    public double getMaturityAmount(){
    return (double)super.getAmount()*this.rate*super.getYears()/100;
    }
}
