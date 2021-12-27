package com.john.dojo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.john.dojo.models.Language;
import com.john.dojo.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	@Autowired
	private LanguageRepository languageRepository;

	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	public List<Language> getAllLanguages() {
		return this.languageRepository.findAll();
	}
	public Language getLanguageByID(Long id) {
		return this.languageRepository.findById(id).get();
	}
	public Language create(Language language) {
		return this.languageRepository.save(language);
	}
	public void updateLanguage(Long id, Language newLanguage) {
		Language language = this.languageRepository.findById(id).get();
		language.setName(newLanguage.getName());
		language.setCreator(newLanguage.getCreator());
		language.setCurrentVersion(newLanguage.getCurrentVersion());
	}
	public void delete(Long id) {
		this.languageRepository.deleteById(id);
	}
}