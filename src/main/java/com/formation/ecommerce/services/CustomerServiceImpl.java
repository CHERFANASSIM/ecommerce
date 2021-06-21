package com.formation.ecommerce.services;

import org.springframework.stereotype.Service;

import com.formation.ecommerce.models.entities.Customer;
import com.formation.ecommerce.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	public final CustomerRepository repo;

	public CustomerServiceImpl(CustomerRepository repo) {
		this.repo = repo;
	}

	@Override
	public void create(Customer customer) {
		repo.save(customer);
	}

	@Override
	public Customer getById(Long id) {
		Customer customer = repo.findById(id).get();
		return customer;
	}

}
