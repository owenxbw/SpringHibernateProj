package com.springdemo.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer") // parent mapping
public class CustomerController {
	@RequestMapping("/showForm")
	public String showPage2(Model theModel) {
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer",theCustomer);
		return "customer";
	}
	
	@RequestMapping("/processForm")
	public String showPage1(@Valid @ModelAttribute("customer") Customer customer,
							BindingResult theBindingResult) {
		System.out.println("Binding result: "+ theBindingResult);
		if(theBindingResult.hasErrors()) // if error occurs 
			return "customer";
		else
			return "customer-confirmation";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) { //removes white spaces in all String inputs
		StringTrimmerEditor STE = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, STE);
	}

}
