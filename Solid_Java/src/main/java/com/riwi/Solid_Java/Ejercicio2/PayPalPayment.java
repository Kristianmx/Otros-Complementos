package com.riwi.Solid_Java.Ejercicio2;

public class PayPalPayment implements PaymentMethod{
    @Override
    public void processPayment(String paymentType) {
        System.out.println("Este pago es hecho con " + paymentType);
    }
    public PayPalPayment(){

    }
}
