package com.wizard.webstore.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wizard.webstore.domain.Product;
import com.wizard.webstore.service.ProductService;

@RequestMapping("/products")
@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping
	public String list(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}

	@RequestMapping("/all")
	public String allProducts(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}

	@RequestMapping("/{category}")
	public String getProductsByCategory(Model model, @PathVariable("category") String productCategory) {
		model.addAttribute("products", productService.getProductsByCategory(productCategory));
		return "products";
	}

	@RequestMapping("/filter/{ByCriteria}")
	public String getProductsByFilter(@MatrixVariable(pathVar = "ByCriteria") Map<String, List<String>> filterParams, Model model) {
		model.addAttribute("products", productService.getProductsByFilter(filterParams));
		return "products";
	}

	@RequestMapping("/product")
	public String getProductById(@RequestParam("id") String productId, Model model) {
		model.addAttribute("product", productService.getProductById(productId));
		return "product";
	}
	
	@RequestMapping("/{category}/{price}")
	public String filterProducts(
			@PathVariable("category") String productCategory, 
			@MatrixVariable(pathVar = "price") Map<String, List<String>> filterParams, 
			@RequestParam("manufacturer") String manufacturer,
			Model model) {
		
		for(Product product : productService.getProductsByPriceFilter(filterParams)) {
            System.out.println(product.getName());
        }
		
		List<Product> filterProducts= productService.getProductsByCategory(productCategory);
		
		filterProducts.retainAll(productService.getProductsByPriceFilter(filterParams));
		filterProducts.retainAll(productService.getProductsByManufacturer(manufacturer));
		model.addAttribute("products", filterProducts);
		return "products";
	}

}