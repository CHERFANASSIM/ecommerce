package com.formation.ecommerce.services;

import org.springframework.stereotype.Service;

import com.formation.ecommerce.models.dtos.CommandLineCreate;
import com.formation.ecommerce.models.entities.Command;
import com.formation.ecommerce.models.entities.CommandLine;
import com.formation.ecommerce.models.entities.Product;
import com.formation.ecommerce.repositories.CommandLineRepository;
import com.formation.ecommerce.repositories.CommandRepository;
import com.formation.ecommerce.repositories.ProductRepository;

@Service
public class CommandLineServiceImpl implements CommandLineService {

	public final CommandLineRepository commandLines;
	public final CommandRepository commands;
	public final ProductRepository products;

	public CommandLineServiceImpl(CommandLineRepository commandLines, CommandRepository commands,
			ProductRepository products) {

		this.commandLines = commandLines;
		this.commands = commands;
		this.products = products;
	}

	@Override
	public void createCommandLine(CommandLineCreate dto) {

		CommandLine commandLine = new CommandLine();
		commandLine.setQuantity(dto.getQuantity());
		commandLine.setPrice(dto.getPrice());
		Long commandId = dto.getCommandId();
		Command command = commands.getOne(commandId);
		Long productId = dto.getProductId();
		Product product = products.getOne(productId);
		commandLine.setCommand(command);
		commandLine.setProduct(product);
		commandLines.save(commandLine);

	}

	@Override
	public CommandLine getCommandLineById(Long id) {
		CommandLine commandLine = commandLines.findById(id).get();

		return commandLine;
	}

}
