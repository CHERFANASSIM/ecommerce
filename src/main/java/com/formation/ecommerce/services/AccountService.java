package com.formation.ecommerce.services;

import com.formation.ecommerce.models.dtos.AccountCreate;
import com.formation.ecommerce.models.dtos.AccountLogin;
import com.formation.ecommerce.security.IdToken;

public interface AccountService {

	void create(AccountCreate dto);

	IdToken login(AccountLogin dto);

	// String getPasswordByName(String name);

}
