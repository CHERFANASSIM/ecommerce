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

import com.formation.ecommerce.models.dtos.ProductCreate;
import com.formation.ecommerce.models.dtos.ProductUpdate;
import com.formation.ecommerce.models.entities.Product;
import com.formation.ecommerce.services.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	public final ProductService service;

	public ProductController(ProductService service) {
		this.service = service;
	}

	@PostMapping("products/create")
	public void createProduct(@Valid @RequestBody ProductCreate dto) {
		service.createProduct(dto);
	}

	@GetMapping("/products/byid/{id}")
	public Product getProductById(@PathVariable("id") long id) {
		return service.getProductById(id);
	}

	@GetMapping("/products")
	public List<Product> getAllproducts() {
		return service.getAllProducts();
	}

	@GetMapping("/products/{name}/name")
	public Product getProductByName(@PathVariable("name") String name) {
		return service.getProductByName(name);
	}

	@DeleteMapping("/products/{id}/delete")
	public String DeleteProduct(@PathVariable("id") long id) {
		service.DeleteProduct(id);

		return "Product deleted";
	}

	@PutMapping("/products/{id}")
	public String UpdateProduct(@PathVariable("id") long id, @RequestBody ProductUpdate dto) {
		service.UpdateProduct(id, dto);

		return "product updated";

	}

}
