package com.example.springrestapiwithb2tech.controller;

import com.example.springrestapiwithb2tech.model.Employee;
import com.example.springrestapiwithb2tech.service.EmployeeService;
import com.example.springrestapiwithb2tech.service.implement.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

//    @Value("${app.name}")
//    private String applicationName;
//
//    @Value("${app.version}")
//    private String applicationVersion;
//
//    @GetMapping("/version")
//    public String getAppInfo() {
//        return applicationName + " - " + applicationVersion;
//    }

    @Autowired
    private EmployeeServiceImp employeeService;

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee getDetail(@PathVariable Long id){
        return employeeService.getEmployeeDetail(id);
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }
}
