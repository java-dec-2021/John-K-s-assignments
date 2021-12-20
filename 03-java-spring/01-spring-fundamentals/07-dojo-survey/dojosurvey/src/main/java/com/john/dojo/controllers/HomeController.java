package com.john.dojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@PostMapping("/survey")
	public String survey(
			@RequestParam(value = "firstName") String firstName,
			@RequestParam(value = "location") String myDojo,
			@RequestParam(value = "language") String myLanguage,
			@RequestParam(value = "comment,", required = false) String Comment, 
			Model model) {
		model.addAttribute("firstName", firstName);
		model.addAttribute("location", myDojo);
		model.addAttribute("language", myLanguage);
		model.addAttribute("comment", Comment);
		return "survey.jsp";
	}
}