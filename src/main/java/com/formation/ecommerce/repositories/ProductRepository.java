package com.formation.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.ecommerce.models.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findByName(String name);

	boolean existsByName(String value);

}
