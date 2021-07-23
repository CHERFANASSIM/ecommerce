package com.formation.ecommerce.models.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "commands")
public class Command {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long idCommand;
	private LocalDate date;
	@OneToMany(mappedBy = "command")
	private List<CommandLine> items;

	@ManyToOne
	@JoinColumn(name = "id_customer", nullable = false, updatable = false)
	private Customer customer;

	public Command() {
	}

	public Long getIdCommand() {
		return idCommand;
	}

	public void setIdCommand(Long idCommand) {
		this.idCommand = idCommand;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;

	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<CommandLine> getItems() {
		return items;
	}

	public void setItems(List<CommandLine> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Command [idCommand=" + idCommand + ", date=" + date + ", items=" + items + ", customer=" + customer
				+ "]";
	}

}
