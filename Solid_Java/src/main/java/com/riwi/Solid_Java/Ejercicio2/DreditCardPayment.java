package com.riwi.Solid_Java.Ejercicio2;

public class DreditCardPayment implements PaymentMethod{
    @Override
    public void processPayment(String paymentType) {
        System.out.println("Este pago es con tarjeta de " + paymentType);
    }

    public DreditCardPayment(){}
}
