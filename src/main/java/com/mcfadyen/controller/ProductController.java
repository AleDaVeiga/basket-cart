package com.mcfadyen.controller;

import javax.inject.Inject;

import com.mcfadyen.model.repository.ProductRepository;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Controller
@Path("/products")
public class ProductController {
	private final Result result;
	private final ProductRepository productRepository;

	/**
	 * @deprecated CDI eyes only
	 */
	protected ProductController() {
		this(null, null);
	}

	@Inject
	public ProductController(Result result, ProductRepository todoRepository) {
		this.result = result;
		this.productRepository = todoRepository;
	}

	@Get("")
	public void get() {
		result.use(Results.json()).withoutRoot().from(productRepository.findAll()).serialize();
	}
}
