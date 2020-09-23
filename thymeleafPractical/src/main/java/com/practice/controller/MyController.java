package com.practice.controller;



import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about",method = RequestMethod.GET)
	public String about(Model model ) {
		System.out.println("Inside About Handler...");
		model.addAttribute("name", "Sojib");
	    model.addAttribute("currentDate", new Date().toLocaleString());
		return "about";
	}
	
	//handling iteration
	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {
		System.out.println("Inside About Handler...");
		//create a list,set collection
		List<String> name = List.of("sojib","Rana","sagor","Fakhrul");
		model.addAttribute("name",name);
		return "iterate";
		
	}
}
