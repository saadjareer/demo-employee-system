package com.example.demoemployeesystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demoemployeesystem.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    
    
}
