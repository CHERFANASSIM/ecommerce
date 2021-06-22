package com.formation.ecommerce.services;

import javax.validation.Valid;

import com.formation.ecommerce.models.dtos.CommandCreate;
import com.formation.ecommerce.models.entities.Command;

public interface CommandService {

	Command getCommandById(Long id);

	void createCommand(@Valid CommandCreate dto);

}
