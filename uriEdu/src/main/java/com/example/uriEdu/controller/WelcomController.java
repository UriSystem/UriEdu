package com.example.uriEdu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomController {

	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/homeWelcome")
	public String home(Model model) throws Exception {
		return "thymeleaf/homeWelcome";
	}
}
