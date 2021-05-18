package br.com.study.springboot.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.study.springboot.model.entities.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@PostMapping
	public Product newProduct(@RequestParam String name) {
		Product product = new Product(name);
		return product;
	}
}
