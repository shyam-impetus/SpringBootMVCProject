package com.simplilearn.SpringBootMVCProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingMVCController {
	
	@GetMapping("/greeting")
	public String greeting(Model model) {
		model.addAttribute("name", "Dhruvik");
		return "hello";
	}

}
