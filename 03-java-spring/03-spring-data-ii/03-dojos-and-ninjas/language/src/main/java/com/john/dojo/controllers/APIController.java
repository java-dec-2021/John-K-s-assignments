package com.john.dojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class APIController {
	
	@GetMapping("/")
	public String newDojo() {
		return "redirect:/new";
	}
}