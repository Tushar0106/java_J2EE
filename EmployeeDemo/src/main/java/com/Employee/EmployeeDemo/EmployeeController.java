package com.Employee.EmployeeDemo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {
	
	@Autowired
	SessionFactory factory;
	
	@RequestMapping("checkfactory")
	public String getFactory() {
		System.out.println("Factory >> "+factory);
		
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list = criteria.list();
		for (Employee emp : list) {
			System.out.println(emp.getId()+" "+emp.getName());
		}
		
		return "Done...";
	}
	
	@RequestMapping("index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	@RequestMapping("allemployee")
	public ModelAndView getAllEmployee() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ListOfEmp");
		
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list = criteria.list();
	
		
		mav.addObject("empdata",list);
		return mav;
	}
	
	@RequestMapping("insert")
	public ModelAndView insert() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("InsertEmployee");
		
		return mav;
	}
	
	@RequestMapping("insertemp")
	public ModelAndView insertEmp(@RequestBody Employee employee) {
		System.out.println(employee);
		
		ModelAndView mav = new ModelAndView();
		return mav;
	}
	
}
