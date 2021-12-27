package com.john.dojo.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.john.dojo.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	
	//Get list of languages
	List<Language> findAll();
	//Delete language by id
	void deleteById(Long id);
}