package com.formation.ecommerce.services;

import javax.validation.Valid;

import com.formation.ecommerce.models.entities.Customer;

public interface CustomerService {

	void create(@Valid Customer customer);

	Customer getById(Long id);

}
