package com.example.springrestapiwithb2tech.repository;

import com.example.springrestapiwithb2tech.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
