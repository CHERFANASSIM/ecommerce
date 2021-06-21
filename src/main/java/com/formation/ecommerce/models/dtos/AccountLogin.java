package com.formation.ecommerce.models.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class AccountLogin {

	@Email
	private String userName;

	@Size(min = 8, max = 12, message = "il doit etre entre 8 et 12")
	private String password;

	public AccountLogin() {

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
