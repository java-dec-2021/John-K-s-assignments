package com.john.dojo.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.john.dojo.models.Dojo;
import com.john.dojo.services.OneService;


@Controller
public class DojoController {
	@Autowired
	private OneService oneService;
	
	
	@GetMapping("/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
		model.addAttribute("dojos", this.oneService.findAll());
		return "dojo.jsp";
	}
	@PostMapping("/createDojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			return "Dojo.jsp";
		}
		this.oneService.createDojo(dojo);
		return "redirect:/ninja/new";
	}
	@GetMapping("/{id}")
	public String showDetails(Model model, @PathVariable("id") Long id) {
		model.addAttribute("displayDojo", this.oneService.findOneDojo(id));
		return "show.jsp";
	}
}