package br.com.study.springboot.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.study.springboot.model.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>  {

	
}
