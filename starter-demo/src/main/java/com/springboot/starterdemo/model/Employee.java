package com.springboot.starterdemo.model;

public class Employee
{
    private String employeeNo;
    private String employeeName;
    private String employeeDepartment;

    public Employee(String employeeNo, String employeeName, String employeeDepartment) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNo='" + employeeNo + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                '}';
    }
}
