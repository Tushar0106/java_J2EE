package com.smvc.springMVC;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	@RequestMapping("/testjsp")
	public String welcome() {
		return "index.html";
	}

	@RequestMapping("/allstudents")
	public ModelAndView fecthStudents() {
		//create object of inbuilt class ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		
		//call the setViewName method of ModelAndView and pass the parameter as name of jsp file to navigate the page 
		modelAndView.setViewName("students");
		
		// simple core java ArrayList created here 		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(123, "jbk"));
		list.add(new Student(345, "jbkiran"));
		list.add(new Student(567, "javabykiran"));
		
		//call the adddObject method of ModelAndView to send the data to the jsp file with key and value format(stulist is a data and list is obj of ArrayList)
		modelAndView.addObject("studlist", list);
		
		//return the obj of ModelAndView class
		return modelAndView;
	}
}
