package com.morrisons.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.morrisons.demo.service.ProductService;
import com.morrisons.demo.entities.Product;

/**
 * Product controller.
 */
@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;

	/**
     * List all products.
     *
     * @param model
     * @return
     */
    @GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Product> list() {        
        System.out.println("Returning rpoducts:");
        return productService.listAllProducts();
    }

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping(value = "/product/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> showProduct(@PathVariable Integer id) {  
    	Product product = productService.getProductById(id).get();
    	System.out.println(product);
        return ResponseEntity.ok().body(product);
    }

}
