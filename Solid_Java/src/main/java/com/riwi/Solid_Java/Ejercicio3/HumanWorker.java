package com.riwi.Solid_Java.Ejercicio3;

public class HumanWorker implements Workable,Eatable{
    @Override
    public void eat() {
        System.out.println("Es su hora de comer, deje el trabajo");
    }

    @Override
    public void work() {
        System.out.println("Siga Trabajando o esta despedido");
    }
    public HumanWorker(){}
}
