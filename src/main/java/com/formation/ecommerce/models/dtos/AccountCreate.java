package com.formation.ecommerce.models.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.formation.ecommerce.validation.UniquesAccountUserName;

public class AccountCreate {

	@Email
	@Size(max = 255)
	@UniquesAccountUserName
	private String userName;
	@NotBlank
	@Size(min = 8, max = 12)
	private String password;

	public AccountCreate() {

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
