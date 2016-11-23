package appsuite.repository;

import org.springframework.data.repository.CrudRepository;

import appsuite.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
}