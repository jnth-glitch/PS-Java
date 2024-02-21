package com.training;

public class SBI extends Bank{


    public float getRate() {
        return rate;
    }

    private float rate;
    public SBI(){}
    public SBI(double amount, float years) {
        super(amount,years);
        this.rate=(float)8;
    }
    @Override
    public double getMaturityAmount(){
        return (double)super.getAmount()*this.rate*super.getYears()/100;
    }
}
