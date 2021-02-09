package com.springboot.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {
	
	@RequestMapping("signup")
	public String signup() {
		return "signup";
	}
	
	@RequestMapping("addEmployee")
	public ModelAndView addEmployee(Employee emp) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",emp);
		mv.setViewName("home2");
		return mv;
	}
	
}
