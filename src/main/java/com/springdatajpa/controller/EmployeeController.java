package com.springdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springdatajpa.entity.Employee;
import com.springdatajpa.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/addEmployee") // single employee
	public Employee addProduct(@RequestBody Employee product) {
		return service.saveEmployee(product);
	}
	@PostMapping("/addEmployees") // multiple employees
	public List<Employee> addEmployee(@RequestBody List<Employee> employees) {
		return service.saveEmployees(employees);
	}
	
	@GetMapping("/employees") // get all employees
	public List<Employee> findAllEmployee(){
		return service.getEmployees();
	}
	@GetMapping("/employeebyId/{id}") // get employee by id
	public Employee findProductById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}
	
	@PutMapping("/update") // update employee
    public Employee updateEmployee(@RequestBody Employee employee) {
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/delete/{id}") // delete employee with id
    public String deleteProduct(@PathVariable int id) {
        return service.deleteEmployee(id);
    }
	
	
}
