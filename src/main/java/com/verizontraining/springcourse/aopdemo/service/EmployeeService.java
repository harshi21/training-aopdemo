package com.verizontraining.springcourse.aopdemo.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public void getEmployees(String name) {
		System.out.println("Get Employees started execution");
		System.out.println("Logged before method execute");
		this.getAverageSalary();
		System.out.println("Returned values");
		
	
	}
    public void createEmployees() {
    	System.out.println("Logged before method execute");
    	System.out.println("Create employees");
    }
    
    public Double getAverageSalary() {
    	System.out.println("Logged before method execute");
    	return (double) (5000/12);
    }
}
