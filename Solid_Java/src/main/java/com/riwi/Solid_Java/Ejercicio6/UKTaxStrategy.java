package com.riwi.Solid_Java.Ejercicio6;

public class UKTaxStrategy implements TAxStrategy {
    @Override
    public double calculateTax() {
        //Aquí va la lógica para calcular el impuesto de UK
        return 0.6;
    }
    public UKTaxStrategy(){

    }
}
