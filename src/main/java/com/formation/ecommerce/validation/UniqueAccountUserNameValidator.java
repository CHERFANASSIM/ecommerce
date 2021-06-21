package com.formation.ecommerce.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.formation.ecommerce.repositories.AccountRepository;

public class UniqueAccountUserNameValidator implements ConstraintValidator<UniquesAccountUserName, String> {

	private final AccountRepository accounts;

	public UniqueAccountUserNameValidator(AccountRepository accounts) {

		this.accounts = accounts;
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;

		}
		return !accounts.existsByUserName(value);

	}

}
