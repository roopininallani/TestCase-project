package com.niit.simcon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DAO.UserDAO;
import com.niit.model.User;




@Controller
public class HomeController {
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	User user;

	@RequestMapping("/")

	public String homepage() {
		System.out.println("home page method in controller");
		return "Home";
	}

	@RequestMapping("/login")

	public ModelAndView showloginPage() {
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("msg", "you clicked login link");
		mv.addObject("showLoginPage", "true");

		System.out.println("login succsess");
		return mv;
	}

	@RequestMapping("/registration")
	
	public ModelAndView showRegistrationPage() {
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("msg", "you clicked registration link");
		mv.addObject("showRegistrationPage","true");
		
		System.out.println("reg  succsess");

		return mv;
	}

	@RequestMapping("/validate")
	public ModelAndView validate(@RequestParam("id") String id,@RequestParam("password")String pwd)

	{
		System.out.println("in validate method");
		System.out.println("id"+id);
		System.out.println("pwd"+pwd);
		ModelAndView mv = new ModelAndView("Home");

	

		if (userDAO.validate(id, pwd) != null)
		{
			mv.addObject("succsessMsg", "you logged in successfully");
			
          
	    }

		else
		{
			mv.addObject("errorMsg", "Invalid Credentials.. Please try Again");
		
		}
		return mv;
		
	}
	
	
}
