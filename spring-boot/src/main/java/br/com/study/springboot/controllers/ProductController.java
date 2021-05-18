package br.com.study.springboot.controllers;

import java.util.ArrayList;
import java.util.Optional;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.study.springboot.model.entities.Product;
import br.com.study.springboot.model.repositories.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;

	@PostMapping
	public Product newProduct(@Valid Product product) {
		productRepository.save(product);
		return product;
	}
	
	@GetMapping
	public Iterable<Product> getProducts() {
		return productRepository.findAll();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Product> getProductById(@PathVariable int id) {
		return productRepository.findById(id);
	}
	
}
