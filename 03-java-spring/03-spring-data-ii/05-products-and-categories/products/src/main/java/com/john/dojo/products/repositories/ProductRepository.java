package com.john.dojo.products.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.john.dojo.products.models.Product;
import com.john.dojo.products.models.Category;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
	List<Product> findAllByCategories( Category product );

}