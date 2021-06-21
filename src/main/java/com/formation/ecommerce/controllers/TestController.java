package com.formation.ecommerce.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
public class TestController {

	@GetMapping("/anonmymous-only")
	public String anonymousOnly() {
		return "I am anonymous user! ";

	}

	@GetMapping("/basic-only")
	public String basicOnly() {
		return "I am basic user! ";
	}

	@GetMapping("/admin-only")
	public String adminOnly() {
		return "I am admin user! ";
	}

	@GetMapping("/manager-only")
	public String managerOnly() {
		return "I am manager user! ";
	}

	@GetMapping("/admin-manager-only")
	public String adminManagerOnly() {
		return "I am admin and manager user! ";
	}

	@GetMapping("/admin-basic-only")
	public String adminBasicOnly() {
		return "I am admin and basic user! ";
	}
}
