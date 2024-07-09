package com.riwi.Solid_Java.Ejercicio5;

public class MainEjercicio5 {
    public static Employee employee = new Employee("Juan",320);
    public static void main(String[] args){

        PayrollService payrollService = new PayrollService(employee);
        EmployeeReport employeeReport = new EmployeeReport(employee);
        EmployeeRepository employeeRepository = new EmployeeRepository(employee);
        payrollService.CalculatePay();
        employeeReport.generateReport();
        employee.setSalary(150);
        employee.setName("camila");
        employeeRepository.saveToDatabase(employee);
        employeeReport.generateReport();


    }
}
