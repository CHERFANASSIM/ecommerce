package com.formation.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.ecommerce.models.entities.CommandLine;

public interface CommandLineRepository extends JpaRepository<CommandLine, Long> {

}
