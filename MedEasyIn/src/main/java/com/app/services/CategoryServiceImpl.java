package com.app.services;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Categories;
import com.app.repository.CategoryRepository;
import com.app.repository.ProductRepository;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired 
	private ProductRepository productRepository;
	
	@Override
	public Categories saveCategory(Categories Category) {
		
		return categoryRepository.save(Category);
	}
	
	@Override
	public Optional<Categories> getCategory(Long CatId) {
		
		return categoryRepository.findById(CatId);
	}

	@Override
	public List<Categories> getAllCategories() {
		
		return categoryRepository.findAll();
	}
	
	

	@Override
	public void deleteProductsByCategory(Long categoryId) {
		Optional<Categories> category=getCategory(categoryId);
		categoryRepository.deleteById(categoryId);
		productRepository.deleteByCategoryId(category.get());
		
	}
	
	
	
	
}
