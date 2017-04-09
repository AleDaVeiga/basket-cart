package com.mcfadyen.controller;

import javax.inject.Inject;

import com.mcfadyen.model.entity.CommerceItem;
import com.mcfadyen.model.entity.ShoppingCart;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.serialization.gson.WithoutRoot;
import br.com.caelum.vraptor.view.Results;

@Controller
@Path("shoppingcart")
public class ShoppingCartController {
	private final Result result;
	private final ShoppingCart cart;

	/**
	 * @deprecated CDI eyes only
	 */
	protected ShoppingCartController() {
		this(null, null);
	}

	@Inject
	public ShoppingCartController(Result result, ShoppingCart cart) {
		this.result = result;
		this.cart = cart;
	}

	@Get("")
	public void get() {
		result.use(Results.json()).withoutRoot().from(cart).include("items").serialize();
	}
	
	@Post("/items")
	@Consumes(value = "application/json", options = WithoutRoot.class)
	public void addItem(CommerceItem item) {
		cart.addItem(item);
		result.use(Results.json()).withoutRoot().from(item).serialize();
	}
	
	@Delete("/items/{id}")
	public void deleteItem(String id) {
		CommerceItem item = cart.getItem(id);
		cart.removeItem(id);
		result.use(Results.json()).withoutRoot().from(item).serialize();
	}
}
