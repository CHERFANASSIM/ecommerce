package com.formation.ecommerce.services;

import javax.validation.Valid;

import com.formation.ecommerce.models.dtos.CommandLineCreate;
import com.formation.ecommerce.models.entities.CommandLine;

public interface CommandLineService {

	void createCommandLine(@Valid CommandLineCreate dto);

	CommandLine getCommandLineById(Long id);

}
