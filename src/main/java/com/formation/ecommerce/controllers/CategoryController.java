package com.formation.ecommerce.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.ecommerce.models.dtos.CategoryCreate;
import com.formation.ecommerce.models.dtos.CategoryUpdate;
import com.formation.ecommerce.models.entities.Category;
import com.formation.ecommerce.services.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {

	public final CategoryService service;

	public CategoryController(CategoryService service) {
		this.service = service;
	}

	@PostMapping("/categories/create")
	public void createCategory(@Valid @RequestBody CategoryCreate dto) {
		service.createCategory(dto);
	}

	@GetMapping("/categories/byid/{id}")
	public Category getCategoryById(@PathVariable("id") long id) {
		return service.getCategoryById(id);
	}

	@GetMapping("/categories")
	public List<Category> getAllCategories() {
		return service.getAllCategories();
	}

	@GetMapping("/categories/{name}/name")
	public Category getCategoryByName(@PathVariable("name") String name) {
		return service.getCategoryByName(name);
	}

	@PutMapping("/categories/{id}")
	public String UpdateCategory(@PathVariable("id") long id, @RequestBody CategoryUpdate dto) {
		service.UpdateCategory(id, dto);

		return "category updated";

	}

	@DeleteMapping("/categories/{id}/delete")
	public String DeleteCategory(@PathVariable("id") long id) {
		service.DeleteCategory(id);

		return "Categorie deleted";
	}

}
