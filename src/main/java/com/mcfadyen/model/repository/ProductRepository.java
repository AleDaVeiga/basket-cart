package com.mcfadyen.model.repository;

import static com.mcfadyen.model.entity.Product.newProduct;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import com.mcfadyen.model.entity.Product;

@ApplicationScoped
public class ProductRepository implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Map<Long, Product> productList;

	@PostConstruct
	public void init() {
		this.productList = new HashMap<Long, Product>();
		long id = 1;
		addProduct(newProduct(id++, "TV", 600));
		addProduct(newProduct(id++, "DVD", 50));
		addProduct(newProduct(id++, "FIRE CAST", 100));
		addProduct(newProduct(id++, "SOUND BAR", 200));
		addProduct(newProduct(id++, "TV PANEL", 70));
	}

	private void addProduct(Product product) {
		this.productList.put(Long.parseLong(product.getId()), product);
	}

	public List<Product> findAll() {
		return new ArrayList<>(this.productList.values());
	}
}
