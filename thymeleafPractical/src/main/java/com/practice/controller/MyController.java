package com.practice.controller;



import java.time.LocalDateTime;
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
	//handler for conditional statements
	@GetMapping("/condition")
	public String conditionHandler(Model model)
	{
		System.out.println("Inside About Handler...");
		model.addAttribute("isActive", true);
		model.addAttribute("gender","M");
		List<Integer> list = List.of(233);
		model.addAttribute("mylist",list);

		return "condition";
	}
	//handler for including fragments
	@GetMapping("/service")
	public String servicesHandler(Model model) {
		model.addAttribute("title","I Like to eat somosa");
		model.addAttribute("substitle",LocalDateTime.now().toString());
		return "service";
	}
}
