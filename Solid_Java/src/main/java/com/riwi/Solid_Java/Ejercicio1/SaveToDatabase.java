package com.riwi.Solid_Java.Ejercicio1;

import java.util.List;

public class SaveToDatabase {
    public  void saveToDatabase(Order order, List<String> items, double totalAmount){
        order.setItems(items);
        order.setTotalAmount(totalAmount);
    }
    public SaveToDatabase(){

    }
}
