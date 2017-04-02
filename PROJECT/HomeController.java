package com.emusic.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView HomeController() {
		return new ModelAndView("home");
	}
	@RequestMapping("/shirts")
	public ModelAndView HomeController1() {
		return new ModelAndView("shirts");
	}
	@RequestMapping("/jeans")
	public ModelAndView HomeController2() {
		return new ModelAndView("jeans");
	}
	@RequestMapping("/suits")
	public ModelAndView HomeController3() {
		return new ModelAndView("suits");
	}
	@RequestMapping("/trousers")
	public ModelAndView HomeController4() {
		return new ModelAndView("trousers");
	}
	@RequestMapping("/login")
	public ModelAndView HomeController5() {
		return new ModelAndView("login");
	}
}
	
