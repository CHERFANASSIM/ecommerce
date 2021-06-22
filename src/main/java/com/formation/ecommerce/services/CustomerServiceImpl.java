package com.formation.ecommerce.services;

import org.springframework.stereotype.Service;

import com.formation.ecommerce.models.dtos.CustomerCreate;
import com.formation.ecommerce.models.entities.Customer;
import com.formation.ecommerce.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	public final CustomerRepository customers;

	public CustomerServiceImpl(CustomerRepository customers) {
		this.customers = customers;
	}

	@Override
	public void createCustome(CustomerCreate dto) {
		Customer customer = new Customer();
		customer.setName(dto.getName());
		customer.setAdresse(dto.getAdresse());
		customer.setEmail(dto.getEmail());
		customer.setPhone(dto.getPhone());

		customers.save(customer);
	}

	@Override
	public Customer getById(Long id) {
		Customer customer = customers.findById(id).get();
		return customer;
	}

}
