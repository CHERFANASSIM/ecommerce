package com.formation.ecommerce.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.formation.ecommerce.models.dtos.CategoryCreate;
import com.formation.ecommerce.models.dtos.CategoryUpdate;
import com.formation.ecommerce.models.entities.Category;
import com.formation.ecommerce.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	public final CategoryRepository categories;

	public CategoryServiceImpl(CategoryRepository categories) {

		this.categories = categories;
	}

	@Override
	public List<Category> getAllCategories() {
		return categories.findAll();

	}

	@Override
	public void createCategory(CategoryCreate dto) {
		Category category = new Category();
		category.setName(dto.getName());
		category.setDescription(dto.getDescription());

		categories.save(category);
	}

	@Override
	public Category getCategoryById(long id) {
		Category category = categories.findById(id).get();

		return category;
	}

	@Override
	public Category getCategoryByName(String name) {
		Category category = categories.findByName(name).get();
		return category;
	}

	@Override
	public void DeleteCategory(long id) {
		categories.deleteById(id);

	}

	@Override
	public void UpdateCategory(long id, CategoryUpdate dto) {
		// TODO Auto-generated method stub

	}

}
