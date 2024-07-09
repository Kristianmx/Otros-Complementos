package com.riwi.Solid_Java.Ejercicio6;

public class USATaxStrategy implements TAxStrategy{
    @Override
    public double calculateTax() {
        //Aquí va la lógica para calcular el impuesto de USA
        return 0.3;
    }
    public USATaxStrategy(){}
}
