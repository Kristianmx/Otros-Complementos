package com.riwi.Solid_Java.Ejercicio2;

public class PaymentProcessor {
    public void processPayment(String paymentType){
        if (paymentType.equals("credit")){
            PaymentMethod creditPayment = new DreditCardPayment();
            creditPayment.processPayment("Credito");
        }else if (paymentType.equals("paypal")){
            PaymentMethod paypalPayment = new PayPalPayment();
            paypalPayment.processPayment("Paypal");
        }
    }
    public PaymentProcessor(){

    }
}
