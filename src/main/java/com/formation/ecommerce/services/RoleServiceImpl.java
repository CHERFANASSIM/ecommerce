package com.formation.ecommerce.services;

import org.springframework.stereotype.Service;

import com.formation.ecommerce.repositories.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	private final RoleRepository repo;

	public RoleServiceImpl(RoleRepository repo) {
		this.repo = repo;
	}

}
