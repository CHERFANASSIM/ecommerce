package com.formation.ecommerce.models.dtos;

public class CommandLineCreate {

	Long productId;
	private int quantity;
	private double price;
	Long commandId;

	public CommandLineCreate() {
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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

	public Long getCommandId() {
		return commandId;
	}

	public void setCommandId(Long commandId) {
		this.commandId = commandId;
	}

	@Override
	public String toString() {
		return "CommandLineCreate [productId=" + productId + ", quantity=" + quantity + ", price=" + price
				+ ", commandId=" + commandId + "]";
	}

}
