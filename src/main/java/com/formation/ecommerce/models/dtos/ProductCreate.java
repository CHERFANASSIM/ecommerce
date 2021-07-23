package com.formation.ecommerce.models.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.formation.ecommerce.validation.UniqueProductName;

public class ProductCreate {

	private Long idProduct;
	@Size(max = 255)
	@NotNull
	@UniqueProductName
	private String name;
	@Size(min = 8, max = 255)
	@NotNull
	private String description;
	@NotNull
	private double price;
	@NotNull
	private Long idCategory;

	public ProductCreate() {

	}

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductCreate [idProduct=" + idProduct + ", name=" + name + ", description=" + description + ", price="
				+ price + "]";
	}

}
