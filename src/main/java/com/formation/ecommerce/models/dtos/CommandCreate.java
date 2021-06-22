package com.formation.ecommerce.models.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

public class CommandCreate {

	@NotNull
	private LocalDate date;
	@NotNull

	private Long customerId;

	public CommandCreate() {
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

}
