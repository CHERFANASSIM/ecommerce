package com.formation.ecommerce.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.formation.ecommerce.models.dtos.ProductCreate;
import com.formation.ecommerce.models.dtos.ProductUpdate;
import com.formation.ecommerce.models.entities.Category;
import com.formation.ecommerce.models.entities.Product;
import com.formation.ecommerce.repositories.CategoryRepository;
import com.formation.ecommerce.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	public final ProductRepository products;
	public final CategoryRepository categories;

	public ProductServiceImpl(ProductRepository products, CategoryRepository categories) {
		this.products = products;
		this.categories = categories;
	}

	@Override
	public void createProduct(ProductCreate dto) {
		Product product = new Product();
		product.setName(dto.getName());
		product.setDescription(dto.getDescription());
		product.setPrice(dto.getPrice());
		Long categoryId = dto.getIdCategory();
		Category category = categories.getOne(categoryId);
		product.setCategory(category);

		products.save(product);
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
	public List<Product> getAllProducts() {
		return products.findAll();

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
