package net.antra.demo.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MainController {
	
	@RequestMapping("/main")
	public String showMain(Model m) {
		//model.addAttribute("deptList", deptService.loadDeptDetails());
		//ModelAndView m = new ModelAndView("hello",new HashMap<String,String>());
		m.addAttribute("");
		return "hello";
	}
}