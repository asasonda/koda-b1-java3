package com.collection;

public class Employee {
    private String employeeCode;
    private String employeeName;
    private double employeeSalary;

    public  Employee(String employeeCode, String employeeName, double employeeSalary){
        if(employeeCode == null || employeeCode.isBlank()){
            throw new IllegalArgumentException("kode employee tidak boleh kosong");
        }
        if(employeeName == null || employeeName.isBlank()){
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        if(employeeSalary < 0){
            throw new IllegalArgumentException("Salary tidak boleh negatif");
        }

        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeCode(){
        return employeeCode;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public double getEmployeeSalary(){
        return employeeSalary;
    }
}
