package com.formation.ecommerce.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.formation.ecommerce.repositories.CustomerRepository;

public class UniqueCustomerNameValidator implements ConstraintValidator<UniqueCustomerName, String> {
	public final CustomerRepository customers;

	public UniqueCustomerNameValidator(CustomerRepository customers) {
		this.customers = customers;
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		if (value == null) {

			return true;
		}
		boolean j = customers.existsByName(value);

		return !customers.existsByName(value);
	}

}
