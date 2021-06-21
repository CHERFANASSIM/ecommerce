package com.formation.ecommerce.services;

import com.formation.ecommerce.repositories.CommandRepository;

public class CommandServiceImpl implements CommandService {
	public final CommandRepository commands;

	public CommandServiceImpl(CommandRepository commands) {
		this.commands = commands;
	}

}
