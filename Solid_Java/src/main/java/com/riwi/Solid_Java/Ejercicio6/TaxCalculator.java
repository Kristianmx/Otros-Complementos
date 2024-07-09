package com.riwi.Solid_Java.Ejercicio6;

public class TaxCalculator {
    private TAxStrategy usaTaxStrategy = new USATaxStrategy();
    private TAxStrategy ukTaxStrategy = new UKTaxStrategy();

    public double calculateTaxUSA(){
        return usaTaxStrategy.calculateTax();
    }
    public double calculateTaxUK(){
        return ukTaxStrategy.calculateTax();
    }

    public TaxCalculator(){}
}
