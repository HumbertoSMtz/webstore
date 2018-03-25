package com.wizard.webstore.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
	
	public Product getProductById(String productID) {
		return productRepository.getProductById(productID);
	}

	public List<Product> getProductsByCategory(String category) {
		return productRepository.getProductsByCategory(category);
	}

	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
		return productRepository.getProductsByFilter(filterParams);
	}
	
	public Set<Product> getProductsByPriceFilter(Map<String, List<String>> filterParams) {
		return productRepository.getProductsByPriceFilter(filterParams);
	}

	public List<Product> getProductsByManufacturer(String manufacturer) {
		return productRepository.getProductsByManufacturer(manufacturer);
	}
	
	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}
}
