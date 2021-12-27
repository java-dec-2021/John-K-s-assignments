package com.john.dojo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.john.dojo.models.Language;
import com.john.dojo.services.LanguageService;

@RestController
public class APIController {
	@Autowired
	private LanguageService languageService;
	
	@GetMapping("/api/languages")
	public List<Language> dashboard() {
		return this.languageService.getAllLanguages();
	}
	@PostMapping("/api/create")
	public Language create(Language language) {
		return this.languageService.create(language);
	}
	
}