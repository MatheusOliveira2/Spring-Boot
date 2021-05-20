package br.com.study.springboot.controllers;

import java.util.Optional;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.study.springboot.model.entities.Product;
import br.com.study.springboot.model.repositories.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;

	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public Product newProduct(@Valid Product product) {
		productRepository.save(product);
		return product;
	}
	
	@GetMapping
	public Iterable<Product> getProducts() {
		return productRepository.findAll();
	}
	
	@GetMapping(path="/name")
	public Iterable<Product> getProductsByName(@RequestParam(name = "name") String name) {
		return productRepository.findByNameContaining(name);
	}
	
	@GetMapping(path="/page/{pageNumber}")
	public Iterable<Product> getProducts(@PathVariable int pageNumber) {
		Pageable page = PageRequest.of(pageNumber,3);
		return productRepository.findAll(page);
	}
	
	@GetMapping(path="/{id}")
	public Optional<Product> getProductById(@PathVariable int id) {
		return productRepository.findById(id);
	}
	
	@DeleteMapping(path="/{id}")
	public void deleteProduct(@PathVariable int id){
		productRepository.deleteById(id);
	}
	/*
	@PutMapping
	public Product updateProduct(@Valid Product product) {
		productRepository.save(product);
		return product;
	}
	*/
}
