package com.project.onlineexam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.user.Users;

@Controller
public class RegisterController {
	
	@Autowired
	SessionFactory sf;

	@RequestMapping("/")
	public String test() {
		
		return "Registration";
	}
	
	@RequestMapping("register")
	public ModelAndView register(Users users) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.save(users);
		tr.commit();
	
		mav.addObject("msg", "Registration successful");

		return mav;
	}
	
}
