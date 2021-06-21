package com.formation.ecommerce.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.formation.ecommerce.repositories.ProductRepository;

public class UniqueProductNameValidator implements ConstraintValidator<UniqueProductName, String> {
	private final ProductRepository products;

	public UniqueProductNameValidator(ProductRepository products) {

		this.products = products;
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {

			return true;
		}

		return !products.existsByName(value);
	}

}
