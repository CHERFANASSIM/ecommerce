package com.formation.ecommerce.services;

import java.util.List;

import com.formation.ecommerce.models.dtos.CategoryCreate;
import com.formation.ecommerce.models.dtos.CategoryUpdate;
import com.formation.ecommerce.models.entities.Category;

public interface CategoryService {

	List<Category> getAllCategories();

	void createCategory(CategoryCreate dto);

	Category getCategoryById(long id);

	Category getCategoryByName(String name);

	void DeleteCategory(long id);

	void UpdateCategory(long id, CategoryUpdate dto);

}
