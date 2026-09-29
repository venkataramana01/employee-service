package com.venkataramana.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venkataramana.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
