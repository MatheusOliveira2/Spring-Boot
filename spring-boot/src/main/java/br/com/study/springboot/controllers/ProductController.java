package br.com.study.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.study.springboot.model.entities.Product;
import br.com.study.springboot.model.repositories.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;

	@PostMapping
	public Product newProduct(@RequestParam String name) {
		Product product = new Product(name);
		productRepository.save(product);
		return product;
	}
}
