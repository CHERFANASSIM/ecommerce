package com.formation.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.ecommerce.models.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
