package com.verizontraining.springcourse.aopdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizontraining.springcourse.aopdemo.model.Employee;
import com.verizontraining.springcourse.aopdemo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		
		employeeService.getEmployees("Lenin");
		//employeeService.createEmployees();
		return null;
	}
}
