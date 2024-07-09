package com.riwi.Solid_Java.Ejercicio1;

public class PrintOrder {
    public void printOrder(Order order){
        System.out.println("La orden tiene los siguientes items " + order.getItems() + " Y su cantidad es " + order.getTotalAmount());

    }
    public PrintOrder(){

    }
}
