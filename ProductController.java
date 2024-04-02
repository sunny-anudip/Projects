package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController 
{
	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProduct()
	{
		return productService.getProduct();
	}
	
	@PostMapping("/products")
	public Product addNewProduct(@RequestBody Product product)
	{
		return productService.addProduct(product);
	}
	
	@PutMapping("/products")
	public Product editProduct(@RequestBody Product product)
	{
		return productService.updateProduct(product);
	}
	
	@DeleteMapping("/products/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		return productService.deleteProduct(id);
	}
}
