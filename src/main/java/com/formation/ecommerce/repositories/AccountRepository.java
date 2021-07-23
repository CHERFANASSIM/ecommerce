package com.formation.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.ecommerce.models.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

	boolean existsByUserName(String value);

	Optional<Account> findByUserName(String name);

	Optional<Account> findByUserNameAndActivedTrue(String userName);

}
