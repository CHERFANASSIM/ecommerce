package com.formation.ecommerce.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CommandLine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCommandLine;
	@ManyToOne
	@JoinColumn(name = "idProduct")
	private Product product;
	private int quantity;
	private double price;
	@ManyToOne
	@JoinColumn(name = "idCommand")
	private Command command;

	public CommandLine() {

	}

	public Long getIdCommandLine() {
		return idCommandLine;
	}

	public void setIdCommandLine(Long idCommandLine) {
		this.idCommandLine = idCommandLine;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	@Override
	public String toString() {
		return "CommandLine [idCommandLine=" + idCommandLine + ", product=" + product + ", quantity=" + quantity
				+ ", price=" + price + ", command=" + command + "]";
	}

}
