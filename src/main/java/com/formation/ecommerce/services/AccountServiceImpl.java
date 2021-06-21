package com.formation.ecommerce.services;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.formation.ecommerce.models.dtos.AccountCreate;
import com.formation.ecommerce.models.dtos.AccountLogin;
import com.formation.ecommerce.models.entities.Account;
import com.formation.ecommerce.models.entities.Role;
import com.formation.ecommerce.repositories.AccountRepository;
import com.formation.ecommerce.repositories.RoleRepository;
import com.formation.ecommerce.security.BadCredentialsException;
import com.formation.ecommerce.security.IdToken;
import com.formation.ecommerce.security.TokenProvider;

@Service
public class AccountServiceImpl implements AccountService {

	private final PasswordEncoder encoder;
	private final TokenProvider provider;
	private final AccountRepository accounts;
	private final RoleRepository roles;

	public AccountServiceImpl(PasswordEncoder encoder, TokenProvider provider, AccountRepository accounts,
			RoleRepository roles) {

		this.encoder = encoder;
		this.provider = provider;
		this.accounts = accounts;
		this.roles = roles;
	}

	@Override
	public void create(AccountCreate dto) {
		Account account = new Account();

		account.setUserName(dto.getUserName());
		String raw = dto.getPassword();
		String encoded = encoder.encode(raw);
		account.setPassword(encoded);
		account.setActived(true);

		Role role = roles.findByDefaultRole(true);

		account.setRole(role);

		accounts.save(account);
	}

	@Override
	public IdToken login(AccountLogin dto) {
		String userName = dto.getUserName();
		Account entity = accounts.findByUserNameAndActivedTrue(userName).orElseThrow(

				() -> new BadCredentialsException("userName not found: " + userName));

		String encoded = entity.getPassword();
		String raw = dto.getPassword();
		if (!encoder.matches(raw, encoded)) {
			throw new BadCredentialsException("bad password for username :" + userName);
		}
		System.out.println("Login success, generate token");
		// TokenProvider
		// Create a list with the account role's code:
		List<String> authorities = List.of(entity.getRole().getCode());
		// Return an ID token (oauth 2) with the subject and authorities:
		return provider.idToken(userName, authorities);

	}

//	@Override
//	public void login(AccountLogin dto) {
//
//	}
//
//	@Override
//	public String getPasswordByName(String name) {
//		Account account = accounts.findByUserName(name);
//
//		if (account != null) {
//			return account.getPassword();
//		} else {
//			return null;
//		}
//
//	}

}
