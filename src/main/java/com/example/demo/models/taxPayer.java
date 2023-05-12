package com.example.demo.models;

public class taxPayer {

    private double income;

    public taxPayer(){
        this.income = 0;
    }

    public taxPayer(double income){
        this.income = income;
    }

    public double getIncomeEarned(){
        return income;
    }
}
