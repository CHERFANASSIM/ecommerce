package com.formation.ecommerce.models.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.formation.ecommerce.validation.UniqueCategoryName;

public class CategoryUpdate {

	private Long idCategory;
	@NotBlank
	@Size(max = 255)
	@UniqueCategoryName
	private String name;
	@NotBlank
	@Size(min = 8, max = 255)
	private String description;

	public CategoryUpdate() {

	}

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
