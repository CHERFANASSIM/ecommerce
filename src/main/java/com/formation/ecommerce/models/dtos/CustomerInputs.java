package com.formation.ecommerce.models.dtos;

import java.util.List;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.formation.ecommerce.models.entities.Account;
import com.formation.ecommerce.models.entities.Command;
import com.formation.ecommerce.validation.UniqueCustomerName;

public class CustomerInputs {
	
	@UniqueCustomerName
	private String name;
	
	private String phone;
	
	private AddressDTO address;
	
	
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	public CustomerInputs() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	

}
