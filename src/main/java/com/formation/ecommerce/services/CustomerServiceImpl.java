package com.formation.ecommerce.services;

import org.springframework.stereotype.Service;

import com.formation.ecommerce.models.dtos.AddressDTO;
import com.formation.ecommerce.models.dtos.CustomerCreate;
import com.formation.ecommerce.models.dtos.CustomerInputs;
import com.formation.ecommerce.models.entities.Account;
import com.formation.ecommerce.models.entities.Address;
import com.formation.ecommerce.models.entities.Customer;
import com.formation.ecommerce.repositories.AccountRepository;
import com.formation.ecommerce.repositories.AddressRepository;
import com.formation.ecommerce.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	public final CustomerRepository customers;
	public final AccountRepository accounts;
	public final AddressRepository addresses;

	public CustomerServiceImpl(CustomerRepository customers, AccountRepository accounts, AddressRepository addresses) {

		this.customers = customers;
		this.accounts = accounts;
		this.addresses = addresses;
	}

	@Override
	public void createCustome(CustomerCreate dto) {
		Customer customer = new Customer();
		customer.setName(dto.getName());
		// customer.setAdresse(dto.getAdresse());
		customer.setEmail(dto.getEmail());
		customer.setPhone(dto.getPhone());

		customers.save(customer);
	}

	@Override
	public Customer getById(Long id) {
		Customer customer = customers.findById(id).get();
		return customer;
	}

	@Override
	public void createCustomeByEmail(CustomerInputs dto, String userName) {

		Account account = accounts.findByUserName(userName).get();

		Customer customer = new Customer();

		customer.setName(dto.getName());

		customer.setPhone(dto.getPhone());
		customer.setEmail(userName);

		customer.setAccount(account);

		Address address = new Address();

		AddressDTO addressDTO = dto.getAddress();

		address.setCity(addressDTO.getCity());

		address.setCode(addressDTO.getCode());

		address.setCountry(addressDTO.getCountry());

		address.setStreet(addressDTO.getStreet());

		addresses.save(address);

		customer.setAdresse(address);

		customers.save(customer);

	}

}
