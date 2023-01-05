package com.employee.Employee;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class EmployeeController {
	@Autowired
	wishingMethod wm;
	
	@Autowired
	EmployeeList employee;
	List<Employee> list;
	@RequestMapping("listofemployee")
	List<Employee> allEmployee() {
		
		
		employee.empList();
		return list;
	}
	
	
	@Autowired
	SessionFactory sf;
	
	@RequestMapping("employeedetail")
	Object getDetailsOfEmplyee() {
		System.out.println("factory >> "+sf);
		
//		Session session = sf.openSession();
//		Criteria cr = session.createCriteria(Employee.class);
//		List<Employee> list = cr.list();
//		for (Employee employee : list) {
//			System.out.println(" ID :- "+employee.getId()+"\n Name:- "+employee.getName());
//			System.out.println("****************************");
//		}
		return null;
	}
}
