package com.verizontraining.springcourse.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {
	
	@Before(value="execution(* com.verizontraining.springcourse.aopdemo.service.EmployeeService.get*(..)) and args(name)")
	public void beforeLogging(JoinPoint joinPoint, String name) {
		System.out.println("Logged before method execute"+ name);
	}
	
	
	@After(value="execution(* com.verizontraining.springcourse.aopdemo.service.EmployeeService.get*(..)) and args(name)")
	public void afterLogging(JoinPoint joinPoint, String name) {
		System.out.println("Logged after method execute "+ name );
	}
	/*
	@AfterReturning(value="execution(* com.verizontraining.springcourse.aopdemo.service.EmployeeService.get*(..))")
	public void afterReturningLogging(JoinPoint joinPoint) {
		System.out.println("Logged after returning method execute"+joinPoint.getSignature());
	}
	
	@AfterThrowing(value="execution(* com.verizontraining.springcourse.aopdemo.service.EmployeeService.get*(..))")
	public void afterThrowingLogging(JoinPoint joinPoint) {
		System.out.println("Logged after throwing method execute"+joinPoint.getSignature());
	}
	
	*/
	
	/*
	@Around(value="execution(* com.verizontraining.springcourse.aopdemo.service.EmployeeService.*(..))")
	public void aroundLoggin(JoinPoint joinPoint) {
		System.out.println("Around Logging");
	}
	*/
	
	

}
