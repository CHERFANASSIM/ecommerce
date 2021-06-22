package com.formation.ecommerce.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.ecommerce.models.dtos.CustomerCreate;
import com.formation.ecommerce.models.entities.Customer;
import com.formation.ecommerce.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	public final CustomerService service;

	public CustomerController(CustomerService service) {
		this.service = service;
	}

	@PostMapping("/create")
	public void createCustomer(@Valid @RequestBody CustomerCreate dto) {
		service.createCustome(dto);
	}

	@GetMapping("/{id}")
	public Customer getById(@PathVariable("id") Long id) {
		return service.getById(id);
	}

}
