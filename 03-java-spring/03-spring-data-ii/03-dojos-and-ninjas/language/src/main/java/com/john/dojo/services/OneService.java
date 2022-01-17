package com.john.dojo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.john.dojo.models.Dojo;
import com.john.dojo.models.Ninja;
import com.john.dojo.repositories.DojoRepository;
import com.john.dojo.repositories.NinjaRepository;


@Service
public class OneService {

	@Autowired
	private DojoRepository dojoRepo;
	
	@Autowired
	private NinjaRepository ninjaRepo;
	
	// CRUD Operations
	
	public Dojo createDojo(Dojo dojo) {
		return this.dojoRepo.save(dojo);
	}
	
	public Ninja createNinja(Ninja ninja) {
		return this.ninjaRepo.save(ninja);
	}

	public List<Dojo> findAll() {
		return this.dojoRepo.findAll();
	}
	
	public Dojo findOneDojo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
}
