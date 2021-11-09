package com.example.springrestapiwithb2tech.service;

import com.example.springrestapiwithb2tech.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Long id, Employee employee);

    Employee getEmployeeDetail(Long id);

    void deleteEmployee(Long id);
}
