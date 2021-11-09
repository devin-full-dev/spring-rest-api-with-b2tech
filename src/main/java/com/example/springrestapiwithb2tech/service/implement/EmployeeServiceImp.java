package com.example.springrestapiwithb2tech.service.implement;

import com.example.springrestapiwithb2tech.model.Employee;
import com.example.springrestapiwithb2tech.repository.EmployeeRepository;
import com.example.springrestapiwithb2tech.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Optional<Employee> existingEmployee = employeeRepository.findById(id);
        if (existingEmployee.isPresent()) {
            employee.setId(id);
            return employeeRepository.save(employee);
        }
        throw new RuntimeException("User Doesn't Exist!!");
    }

    @Override
    public Employee getEmployeeDetail(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()){
            return employee.get();
        }
        throw new RuntimeException("Employee: " + id + " doesn't exist!!");
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
