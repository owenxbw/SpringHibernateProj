package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@RequestMapping("/processStudentForm")
	public String showPage2(@ModelAttribute("student") Student student) {
		System.out.println(student.getLastName());
		return "student-confirmation";
	}
	@RequestMapping("/showStudentForm")
	public String showPage(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student",theStudent);
		return "student";
	}
}
