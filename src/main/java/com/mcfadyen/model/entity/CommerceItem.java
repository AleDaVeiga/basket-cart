package com.mcfadyen.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class CommerceItem implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private Product product;
	private Integer quantity;
	private BigDecimal amount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}