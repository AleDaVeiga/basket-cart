package com.mcfadyen.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class ShoppingCart implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<CommerceItem> items = new ArrayList<CommerceItem>();
	private BigDecimal amount = BigDecimal.ZERO;

	public void addItem(CommerceItem item) {
		item.setId(String.valueOf(findLastId()));
		this.amount = amount.add(item.getAmount());
		this.items.add(item);
	}
	
	public CommerceItem getItem(String id) {
		for (Iterator<CommerceItem> it = items.iterator(); it.hasNext();) {
			CommerceItem item = (CommerceItem) it.next();
			if(item.getId().equals(id)) {
				return item;
			}
		}
		return null;
	}
	
	public void removeItem(String id) {
		for (Iterator<CommerceItem> it = items.iterator(); it.hasNext();) {
			CommerceItem item = (CommerceItem) it.next();
			if(item.getId().equals(id)) {
				this.amount = amount.subtract(item.getAmount());
				it.remove();
			}
		}
	}

	public List<CommerceItem> getItems() {
		return items;
	}

	public void setItems(List<CommerceItem> items) {
		this.items = items;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	private Long findLastId() {
		Long ultimoId = 1L;
		for (CommerceItem item : items) {
			if (Long.parseLong(item.getId()) >= ultimoId) {
				ultimoId = Long.parseLong(item.getId()) + 1;
			}
		}
		return ultimoId;
	}
}