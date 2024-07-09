package com.riwi.Solid_Java.Ejercicio5;

public class PayrollService {
    private Employee employee;
    public PayrollService(Employee employee){
        this.employee=employee;
    }
    public void CalculatePay(){
        System.out.println("El salario de " + this.employee.getName() + " es " + this.employee.getSalary()*40);
    }
}
