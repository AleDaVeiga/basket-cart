package com.mcfadyen.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String image;
	private BigDecimal price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public static Product newProduct(long id, String name, float price) {
		Product product = new Product();
		product.setId(String.valueOf(id));
		product.setName(name);
		product.setImage(name + ".jpg");
		product.setPrice(BigDecimal.valueOf(price));
		return product;
	}
}
