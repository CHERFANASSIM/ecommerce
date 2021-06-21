package com.formation.ecommerce.services;

import java.util.List;

import javax.validation.Valid;

import com.formation.ecommerce.models.dtos.ProductCreate;
import com.formation.ecommerce.models.dtos.ProductUpdate;
import com.formation.ecommerce.models.entities.Product;

public interface ProductService {

	List<Product> getAllProducts();

	void createProduct(@Valid ProductCreate dto);

	Product getProductById(long id);

	Product getProductByName(String name);

	void DeleteProduct(long id);

	void UpdateProduct(long id, ProductUpdate dto);

}
