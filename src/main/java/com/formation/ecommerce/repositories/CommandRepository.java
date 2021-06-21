package com.formation.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.ecommerce.models.entities.Command;

public interface CommandRepository extends JpaRepository<Command, Long> {

}
