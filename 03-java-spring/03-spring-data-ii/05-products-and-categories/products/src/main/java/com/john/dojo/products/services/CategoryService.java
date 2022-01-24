package com.john.dojo.products.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.john.dojo.products.models.Product;
import com.john.dojo.products.repositories.CategoryRepository;
import com.john.dojo.products.models.Category;
import com.john.dojo.products.repositories.ProductRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;
	public CategoryService(CategoryRepository categoryRepository, ProductRepository productRepository) {
	    this.categoryRepository = categoryRepository;
	    this.productRepository = productRepository;
	}
	public List<Category> allCategories() {
	    return categoryRepository.findAll();
	}
	public Category createCategory(Category b) {
	    return categoryRepository.save(b);
	}
	public Category getCategoryById(Long id) {
	    Optional<Category> optionalCategory = categoryRepository.findById(id);
	    if(optionalCategory.isPresent()) {
	        return optionalCategory.get();
	    } else {
	        return null;
	    }
	}
	public void deleteCategory( Long id ) {
		categoryRepository.deleteById( id );
	}
	public Category updateCategory(Category updatedCategory) {
		return this.categoryRepository.save(updatedCategory);
	}
	public Category updateCategory(Long id, String name) {
		Category updatedCategory = this.categoryRepository.findById(id).orElse(null);
			
		if (updatedCategory != null) {
			updatedCategory.setName(name);
		}
		return this.categoryRepository.save(updatedCategory);
	}
	public List<Category> findCategoriesNotInProduct(Product product) {
		return this.categoryRepository.findByProductsNotContains(product);
	}
	public void addProductToCategory(Category category, Product product) {
		List<Product> products = category.getProducts();
		products.add(product);
		this.categoryRepository.save(category);
	}
	public List<Product> allNonProducts( Category c ) { return productRepository.findByCategoriesNotContains( c ); }
	public List<Product> allProducts( Category c ) { return productRepository.findAllByCategories( c ); }
	
}