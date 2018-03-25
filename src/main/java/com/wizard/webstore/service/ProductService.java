package com.wizard.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import com.wizard.webstore.domain.Product;

public interface ProductService {
	List <Product> getAllProducts();
	Product getProductById(String productID);
	List<Product> getProductsByCategory(String category);
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	Set<Product> getProductsByPriceFilter(Map<String, List<String>> filterParams);
	List <Product> getProductsByManufacturer(String manufacturer);
	void addProduct(Product product);
}
