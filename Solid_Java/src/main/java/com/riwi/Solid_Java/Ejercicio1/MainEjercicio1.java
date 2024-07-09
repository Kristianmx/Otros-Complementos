package com.riwi.Solid_Java.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class MainEjercicio1 {
    public static void main(String[] args){
        List<String> items = new ArrayList<>();
        items.add("manzana");
        items.add("piña");
        items.add("sandia");
        items.add("fresa");

        Order order = new Order(items, 2.4);

        PrintOrder printOrder = new PrintOrder();

        printOrder.printOrder(order);

        SaveToDatabase saveToDatabase =new SaveToDatabase();

        List<String> newItems = new ArrayList<>();

        newItems.add("uva");
        newItems.add("pera");
        newItems.add("melocoton");
        newItems.add("mora");

        saveToDatabase.saveToDatabase(order,newItems,3.0);
        printOrder.printOrder(order);

        CalculateTotal calculateTotal =new CalculateTotal();

        System.out.println("El valor total de la orden es: " + calculateTotal.calculate(order));
    }
}
