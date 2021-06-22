package com.formation.ecommerce.services;

import org.springframework.stereotype.Service;

import com.formation.ecommerce.models.dtos.CommandCreate;
import com.formation.ecommerce.models.entities.Command;
import com.formation.ecommerce.models.entities.Customer;
import com.formation.ecommerce.repositories.CommandRepository;
import com.formation.ecommerce.repositories.CustomerRepository;

@Service
public class CommandServiceImpl implements CommandService {
	public final CommandRepository commands;
	private final CustomerRepository customers;

	public CommandServiceImpl(CommandRepository commands, CustomerRepository customers) {

		this.commands = commands;
		this.customers = customers;
	}

	@Override
	public void createCommand(CommandCreate dto) {
		Command command = new Command();
		command.setDate(dto.getDate());

		Long customerId = dto.getCustomerId();
		Customer customer = customers.getOne(customerId);
		command.setCustomer(customer);
		commands.save(command);
	}

	@Override
	public Command getCommandById(Long id) {
		Command command = commands.findById(id).get();

		return command;
	}

}
