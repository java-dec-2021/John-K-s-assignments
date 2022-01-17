package com.john.dojo.controllers;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.john.dojo.models.Dojo;
import com.john.dojo.models.Ninja;
import com.john.dojo.services.OneService;


@Controller
@RequestMapping("/ninja")
public class NinjaController {

	@Autowired
	private OneService oneService;
	
	@GetMapping("/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> allDojo = this.oneService.findAll();
		model.addAttribute("allDojos", allDojo);
		return "ninja.jsp";
	}
	@PostMapping("/createNinja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			List<Dojo> allDojos = this.oneService.findAll();
			model.addAttribute("allDojos", allDojos);
			return "ninja.jsp";
		}
		this.oneService.createNinja(ninja);
		return "redirect:/";
	}
}
