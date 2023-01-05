package com.employee.Employee;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class wishingMethod {
	
	@Before("execution(* com.employee.Employee.EmployeeController.*())")
	public void wishBefor()
	{
		System.out.println("Welcome to our system...!");
	}
	
	@After("execution(* com.employee.Employee.EmployeeController.*())")
	public void wishBye() {
		System.out.println("Visit again....Thank you...!!!");
	}
}
