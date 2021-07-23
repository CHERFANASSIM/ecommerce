package com.formation.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.ecommerce.models.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
