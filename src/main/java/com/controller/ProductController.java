package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;

	
	@PostMapping("/createProduct")
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}

	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}

	@GetMapping("/product/{productId}")
	public Product getProductById(@PathVariable (value="productId") int productId) {
		return productService.getProductById(productId);
	}

	@DeleteMapping("/product/{productId}")
	public void deleteProductById(@PathVariable (value="productId") int productId) {
		productService.deleteProductById(productId);
	}
}
