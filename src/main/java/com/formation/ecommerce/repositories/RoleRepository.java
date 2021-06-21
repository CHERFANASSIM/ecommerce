package com.formation.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.ecommerce.models.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByDefaultRole(boolean b);

}
