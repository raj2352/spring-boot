package com.springboot.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


	public String home1(HttpServletRequest req)
	{
		String name = req.getParameter("name");
		System.out.println(name);
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		return "home";
	}
	

	public String home2(String name,HttpSession session)
	{
		System.out.println(name);
		session.setAttribute("name", name);
		return "home";
	}

	public ModelAndView home3(@RequestParam("name") String name)
	{
		ModelAndView mv  = new ModelAndView();
		mv.addObject("name",name);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/home")
	public ModelAndView home(Employee employee)
	{
		ModelAndView mv  = new ModelAndView();
		mv.addObject("obj",employee);
		mv.setViewName("home");
		return mv;
	}	
}
