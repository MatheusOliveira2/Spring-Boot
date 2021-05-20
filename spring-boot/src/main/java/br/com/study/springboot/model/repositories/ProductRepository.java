package br.com.study.springboot.model.repositories;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import br.com.study.springboot.model.entities.Product;

//public interface ProductRepository extends CrudRepository<Product, Integer>  {
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
	
	
	public Iterable<Product> findByNameContaining(String name);
}
