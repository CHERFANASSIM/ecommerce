package com.formation.ecommerce.services;

import javax.validation.Valid;

import com.formation.ecommerce.models.dtos.CustomerCreate;
import com.formation.ecommerce.models.dtos.CustomerInputs;
import com.formation.ecommerce.models.entities.Customer;

public interface CustomerService {

	void createCustome(CustomerCreate dto);

	Customer getById(Long id);

	void createCustomeByEmail(@Valid CustomerInputs dto, String userName);

}
