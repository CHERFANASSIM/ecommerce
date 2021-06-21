package com.formation.ecommerce.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name = "categories")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategory;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "description", nullable = false)
	private String description;

	@OneToMany(mappedBy = "category")
	private List<Product> products;

	public Category() {

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

	@Override
	public String toString() {
		return "Category [idCategory=" + idCategory + ", name=" + name + ", description=" + description + ", products="
				+ products + "]";
	}

}
