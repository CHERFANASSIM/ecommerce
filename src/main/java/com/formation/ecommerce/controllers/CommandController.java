package com.formation.ecommerce.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.ecommerce.services.CommandService;

@RestController
@RequestMapping("/command")
public class CommandController {

	public final CommandService service;

	public CommandController(CommandService service) {
		this.service = service;
	}

}
