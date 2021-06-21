package com.formation.ecommerce.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.formation.ecommerce.repositories.CategoryRepository;

public class UniqueCategoryNameValidator implements ConstraintValidator<UniqueCategoryName, String> {

	private final CategoryRepository categories;

	public UniqueCategoryNameValidator(CategoryRepository categories) {
		super();
		this.categories = categories;
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
		}

		return !categories.existsByName(value);

	}

}
