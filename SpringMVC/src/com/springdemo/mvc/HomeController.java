package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	@RequestMapping("/showForm")
	public String showPage1() {
		return "helloworld-form";
	}
	@RequestMapping("/processForm")
	public String showPage2() {
		return "helloworld";
	}
	@RequestMapping("/processFormV2")
	public String showPage3(HttpServletRequest request, Model model) {
		String theName = request.getParameter("studentName");
		theName=theName.toUpperCase();
		String result = "Hi "+theName;
		model.addAttribute("message", result);
		return "helloworld";
	}
	@RequestMapping("/processFormV3") //instead of using HttpServletRequest
	public String showPage4(
			@RequestParam("studentName") String theName, 
			Model model) {
		String result = "Hi "+theName + "V3";
		model.addAttribute("message", result);
		return "helloworld";
	}
	
}
