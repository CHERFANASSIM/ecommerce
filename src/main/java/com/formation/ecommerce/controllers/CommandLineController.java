package com.formation.ecommerce.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.ecommerce.models.dtos.CommandLineCreate;
import com.formation.ecommerce.models.entities.CommandLine;
import com.formation.ecommerce.services.CommandLineService;

@RestController
@RequestMapping("/commandLine")
public class CommandLineController {

	public final CommandLineService service;

	public CommandLineController(CommandLineService service) {

		this.service = service;
	}

	@PostMapping("/create")
	public void createCommandLine(@Valid @RequestBody CommandLineCreate dto) {
		service.createCommandLine(dto);
	}

	@GetMapping("/{id}")
	public CommandLine getById(@PathVariable("id") Long id) {
		return service.getCommandLineById(id);
	}

}
