package com.formation.ecommerce.models.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

public class CommandCreate {

	@NotNull
	private LocalDate date;
	@NotNull

	private int CustomerId;

	public CommandCreate() {
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	/*
	 * public Long getCustomerId() { return CustomerId; }
	 * 
	 * public void setCustomerId(Long customerId) { CustomerId = customerId; }
	 */
	@Override
	public String toString() {
		return "CommandCreate [date=" + date + ", CustomerId=" + CustomerId + "]";
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

}
