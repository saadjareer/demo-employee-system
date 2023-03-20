package com.example.demoemployeesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoemployeesystem.entity.Employee;
import com.example.demoemployeesystem.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/employeesList")
    public List<Employee> getEmployees() {
        
        List<Employee> employees = employeeService.findAll();

        return employees;
    }


    @GetMapping(value = "/employee")
    public Employee getTestEmployee() {

        return new Employee(1000, "Test Employee");
    }
    
}
