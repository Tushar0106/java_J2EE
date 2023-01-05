package com.employee.Employee;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeList {
	@Autowired
	SessionFactory factory;
	Employee emp=null;
	public void empList() {
		System.out.println("Factory >> "+factory);
		
		Session session = factory.openSession();
		Criteria cr = session.createCriteria(Employee.class);
		List<Employee> list = cr.list();
		for (Employee employee : list) {
			System.out.println(employee.getId()+" "+ employee.getName());
		}
		
	}
}
