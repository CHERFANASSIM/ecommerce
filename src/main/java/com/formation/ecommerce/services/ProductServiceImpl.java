package com.formation.ecommerce.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.formation.ecommerce.models.dtos.ProductCreate;
import com.formation.ecommerce.models.dtos.ProductUpdate;
import com.formation.ecommerce.models.entities.Product;
import com.formation.ecommerce.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	public final ProductRepository products;

	public ProductServiceImpl(ProductRepository products) {

		this.products = products;
	}

	@Override
	public List<Product> getAllProducts() {
		return products.findAll();

	}

	@Override
	public void createProduct(@Valid ProductCreate dto) {
		Product Product = new Product();
		Product.setName(dto.getName());
		Product.setDescription(dto.getDescription());

		products.save(Product);
	}

	@Override
	public Product getProductById(long id) {
		Product Product = products.findById(id).get();

		return Product;
	}

	@Override
	public Product getProductByName(String name) {
		Product Product = products.findByName(name).get();
		return Product;
	}

	@Override
	public void DeleteProduct(long id) {
		products.deleteById(id);

	}

	@Override
	public void UpdateProduct(long id, ProductUpdate dto) {
		// TODO Auto-generated method stub

	}

}
