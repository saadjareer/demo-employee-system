package com.example.demoemployeesystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoemployeesystem.entity.Employee;
import com.example.demoemployeesystem.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {

        // creating an object of ArrayList
        ArrayList<Employee> employees = new ArrayList<Employee>();

        // adding employees to the List
        employees.add(new Employee(100, "Sara Ahmed"));
        employees.add(new Employee(200, "Layan Alsukait"));
        employees.add(new Employee(300, "Noura Ali"));
        employees.add(new Employee(400, "Hatoun Alarifi"));
        employees.add(new Employee(500, "Wajd Alzaidi"));

        // returns a list of employees
        return employees;
    }

    public Iterable<Employee> findAllFromDatabase() {

        //creating an object of ArrayList
        Iterable<Employee> employees = employeeRepository.findAll();
        return employees;

    }

}
