package com.formation.ecommerce.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.ecommerce.models.dtos.AccountCreate;
import com.formation.ecommerce.models.dtos.AccountLogin;
import com.formation.ecommerce.security.IdToken;
import com.formation.ecommerce.services.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	private final AccountService service;

	public AccountController(AccountService service) {

		this.service = service;
	}

	@PostMapping
	public void create(@Valid @RequestBody AccountCreate dto) {

		service.create(dto);
	}

	@PostMapping("/login")
	public IdToken login(@Valid @RequestBody AccountLogin dto) {
		return service.login(dto);
	}

//	@PostMapping("/login")
//	public String login(@Valid @RequestBody AccountLogin dto) {
//
//		String name = dto.getUserName();
//
//
//		String password = service.getPasswordByName(name);
//
//		if (password == null) {
//			return "user don't existe";
//		}
//
//		if ((dto.getPassword()).equals(password)) {
//			return "credentiel est bon";
//		} else {
//			return "is not same password";
//		}
//
//	}

}
