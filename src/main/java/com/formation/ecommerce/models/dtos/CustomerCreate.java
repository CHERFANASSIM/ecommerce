package com.formation.ecommerce.models.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.formation.ecommerce.validation.UniqueCustomerName;

public class CustomerCreate {

	private Long idCustomer;

	@NotBlank
	@UniqueCustomerName
	private String name;
	@NotBlank
	private String adresse;
	@Email
	private String email;
	@NotBlank
	private String phone;

	public CustomerCreate() {

	}

	public Long getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
