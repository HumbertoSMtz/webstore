package com.wizard.webstore.domain.repository;

import java.util.List;
import com.wizard.webstore.domain.Product;

public interface ProductRepository {
	List <Product> getAllProducts();
}
