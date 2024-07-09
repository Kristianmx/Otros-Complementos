package com.riwi.Solid_Java.Ejercicio2;

public class MainEjercicio2 {
    public static void main(String[] args){

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.processPayment("credit");
        paymentProcessor.processPayment("paypal");

    }
}
