package com.crud_operation.crudop;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import java.util.*;

import org.apache.coyote.Request;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@RequestMapping("testcontroller")
	public ModelAndView test() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("TestJSP");
		return mav;
	}
	
	@GetMapping("index")
	public ModelAndView getAllEmp() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	@Autowired
	SessionFactory factory;
	
	@RequestMapping("select")
	public ModelAndView select() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("select");
		
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list = criteria.list();
		
		mav.addObject("empList", list);
		return mav;
	}
	
	
	@RequestMapping("insert")
	public String insert() {
		
		return "insert";
	}
	
	
	@RequestMapping(path = "/insertEmp", method = RequestMethod.POST )
	public void insertEmp(@RequestBody Employee employee) {
		employee.getId();
		employee.getName();
		
		System.out.println("I'm in controller");
		System.out.println(employee);
//		System.out.println("Printing...."+employee);
		

	}
	
	@RequestMapping("update")
	public ModelAndView update() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("update");
		return mav;
	}
	@RequestMapping("delete")
	public String delete() {
		return "delete";
	}
}
