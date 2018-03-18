package com.wizard.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.wizard.webstore.domain.Product;
import com.wizard.webstore.domain.repository.ProductRepository;
import com.wizard.webstore.service.ProductService;
import org.springframework.stereotype.Service;

@Service 
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List <Product> getAllProducts(){
		return productRepository.getAllProducts();
	}
	
}
