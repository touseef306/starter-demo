package com.springboot.starterdemo.controller;

import com.springboot.starterdemo.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    //http://localhost:8080/employee
    @GetMapping("employee")
    public Employee getEmployee(){
        Employee testEmp= new Employee("1200","John Doe","Marketing");
        System.out.println(testEmp);
        return testEmp;
    }

   @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1200","John Doe", "Marketing"));
        employees.add(new Employee("1201", "Jane Doe","HR"));
        employees.add(new Employee("1202","Bob wilson","IT"));
        employees.add(new Employee("1203","Harry William","Operations"));

        return employees;
    }

}
