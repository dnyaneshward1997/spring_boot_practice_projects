package com.cdac.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cdac.model.Product;
import com.cdac.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping(value = { "/product" })
	public String productAdd(@RequestBody Product product) {
		productService.add(product);
		return "Product added successfully";
	}

	@PutMapping(value = { "/product" })
	public String productUpdate(@RequestBody Product product) {
		productService.modify(product);
		return "Product updated successfully";
	}

	@DeleteMapping(value = { "/product" })
	public String productDelete(@RequestParam int id) {
		System.out.println("first delete");
		productService.removeById(id);
		return "Product deleted successfully";
	}

	@GetMapping(value = { "/product/{id}" })
	public Product productGet(@PathVariable int id) {
		return productService.getById(id);
	}

	@GetMapping(value = { "/product" })
	public List<Product> productList() {
		return productService.getAll();
	}
}
