package com.morrisons.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.morrisons.demo.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
