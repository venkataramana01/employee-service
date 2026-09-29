package com.venkataramana.employeeservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.venkataramana.employeeservice.entity.Employee;
import com.venkataramana.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private final EmployeeRepository employeeRepository;
	 public EmployeeService(EmployeeRepository employeeRepository) {
	        this.employeeRepository = employeeRepository;
	    }
	 
	 public Employee createEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }
	 
	 public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    public Employee getEmployeeById(Long id) {
	        return employeeRepository.findById(id).orElse(null);
	    }

	    public Employee updateEmployee(Long id, Employee employee) {

	        Employee existingEmployee = employeeRepository.findById(id).orElse(null);

	        if (existingEmployee == null) {
	            return null;
	        }
	        existingEmployee.setName(employee.getName());
	        existingEmployee.setEmail(employee.getEmail());
	        existingEmployee.setDepartment(employee.getDepartment());
	        existingEmployee.setSalary(employee.getSalary());

	        return employeeRepository.save(existingEmployee);
	    }

	    public void deleteEmployee(Long id) {
	        employeeRepository.deleteById(id);
	    }
}
