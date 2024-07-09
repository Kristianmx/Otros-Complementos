package com.riwi.Solid_Java.Ejercicio3;

public class MainEjercicio3 {

    public static void main(String[] args){

        System.out.println("Esto es un trabajador humano");
        HumanWorker humanWorker = new HumanWorker();
        humanWorker.work();
        humanWorker.eat();

        System.out.println("\n Este es el trabajador robot");
        RobotWorker robotWorker = new RobotWorker();
        robotWorker.work();
    }
}
