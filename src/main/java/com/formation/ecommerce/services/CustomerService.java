package com.formation.ecommerce.services;

import com.formation.ecommerce.models.dtos.CustomerCreate;
import com.formation.ecommerce.models.entities.Customer;

public interface CustomerService {

	void createCustome(CustomerCreate dto);

	Customer getById(Long id);

}
