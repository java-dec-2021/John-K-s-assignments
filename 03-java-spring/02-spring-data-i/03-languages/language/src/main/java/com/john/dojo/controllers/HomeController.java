package com.john.dojo.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.john.dojo.models.Language;
import com.john.dojo.services.LanguageService;

@Controller
public class HomeController {
	
	@Autowired
	private LanguageService languageService;

	@GetMapping("/")
	public String home() {
		return "redirect:/dashboard";
	}

// Get all languages
	@RequestMapping(value="/dashboard", method= {RequestMethod.POST,RequestMethod.GET})
	public String languages(Model model, @Valid @ModelAttribute("newLanguage") Language language,BindingResult result) {
		model.addAttribute("languages",this.languageService.getAllLanguages());
		if(result.hasErrors()) {
			return "dashboard.jsp";
		}
		this.languageService.create(language);
		return "redirect:/";
	}
	
// Create a new Language
	@RequestMapping(value="/create", method= {RequestMethod.POST,RequestMethod.GET})
	public String create(Model model, @Valid @ModelAttribute("newLanguage") Language language,BindingResult result) {
		model.addAttribute("languages",this.languageService.getAllLanguages());
		if(result.hasErrors()) {
			return "dashboard.jsp";
		}
		this.languageService.create(language);
		return "redirect:/";
	}
	
// Delete a Language
	@RequestMapping(value="/delete/{id}",method= {RequestMethod.DELETE,RequestMethod.POST,RequestMethod.GET})
	public String delete(@PathVariable("id") Long id) {
		this.languageService.delete(id);
		return "redirect:/dashboard";
	}	

	// View Language details
	@RequestMapping(value="/dashboard/{id}", method={RequestMethod.DELETE,RequestMethod.POST,RequestMethod.GET})
	public String view(Model model, @PathVariable("id") Long id) {
		model.addAttribute("language",this.languageService.getLanguageByID(id));
		return "language.jsp";
	}
	
	@GetMapping("/dashboard/{id}/edit")
	public String edit(Model model, @PathVariable("id") Long id) {
		model.addAttribute("language",this.languageService.getLanguageByID(id));
		return "edit.jsp";
	}
	@PutMapping("/dashboard/{id}")
	public String update(@PathVariable("id") Long id,@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            languageService.updateLanguage(id,language);
            System.out.println("hi");
            return "redirect:/dashboard";
        }
	}
}
