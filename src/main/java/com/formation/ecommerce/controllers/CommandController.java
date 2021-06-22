package com.formation.ecommerce.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.ecommerce.models.dtos.CommandCreate;
import com.formation.ecommerce.models.entities.Command;
import com.formation.ecommerce.services.CommandService;

@RestController
@RequestMapping("/commands")
public class CommandController {

	public final CommandService service;

	public CommandController(CommandService service) {
		this.service = service;
	}

	@PostMapping("/create")
	public void createCommand(@Valid @RequestBody CommandCreate dto) {
		service.createCommand(dto);
	}

	@GetMapping("/{id}")
	public Command getById(@PathVariable("id") Long id) {
		return service.getCommandById(id);
	}

}
