package com.wizard.webstore.controller;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wizard.webstore.domain.Product;
import com.wizard.webstore.domain.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping("/products")
	public String list(Model model) {
		model.addAttribute("products", productRepository.getAllProducts());
		return "products";
	}
}