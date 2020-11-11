package com.morrisons.demo.service;

import java.util.Optional;

import com.morrisons.demo.entities.Product;

public interface ProductService {

    Iterable<Product> listAllProducts();

    Optional<Product> getProductById(Integer id);
}
