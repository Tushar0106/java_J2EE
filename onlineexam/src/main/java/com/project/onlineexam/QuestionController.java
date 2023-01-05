package com.project.onlineexam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.user.Questions;

@Controller
public class QuestionController {

	@Autowired
	SessionFactory sf;
	@RequestMapping("gotoQuestion")
	public String gotoQuestion(Questions questions) {
		return "AddQuestion";
	}
	
	@RequestMapping("addQuestion")
	public ModelAndView addQuestion(Questions questions) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("AddQuestion");
		
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.save(questions);
		tr.commit();
		
		mav.addObject("msg", "Question added successful");
		return mav;
	}
}
