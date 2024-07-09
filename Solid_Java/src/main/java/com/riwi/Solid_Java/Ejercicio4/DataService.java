package com.riwi.Solid_Java.Ejercicio4;

public class DataService {
    private DataStorage dataStorage = new Database();
    public void savaData(String data){
        dataStorage.save(data);
    }
}
