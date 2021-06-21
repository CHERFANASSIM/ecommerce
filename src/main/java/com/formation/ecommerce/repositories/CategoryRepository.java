package com.formation.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.ecommerce.models.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	Optional<Category> findByName(String name);

	boolean existsByName(String value);

}
