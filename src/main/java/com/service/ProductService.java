package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {
	@Autowired
	ProductDao productDao;
	
	public Product createProduct(Product product) {
		return productDao.save(product);
	}

	
	public Product updateProduct(Product product) {
		return productDao.save(product);
	}

	public Product getProductById(int id) {
		return productDao.findById(id).get();
	}

	
	public void deleteProductById(int id) {
		productDao.deleteById(id);
		
	}
}
