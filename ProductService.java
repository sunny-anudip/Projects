package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;

@Service
public class ProductService {
	public static int count = 5;
	public static ArrayList<Product> products = new ArrayList<>();
	static
	{
		products.add(new Product(1,"Iphone",100));
		products.add(new Product(2,"Samsung",80));
		products.add(new Product(3,"OnePlus",120));
		products.add(new Product(4,"Pixel",150));
		products.add(new Product(5,"Vivo",130));
	}
	
	public List<Product> getProduct()
	{
		return products;
	}
	
	public Product addProduct(Product product)
	{
		product.setId(++count);
		products.add(product);
		return product;
		
	}
	
	public Product updateProduct(Product product)
	{
		for(Product product2:products)
		{
			if(product2.getId()==product.getId())
			{
				product2.setName(product.getName());
				product2.setQty(product.getQty());
				return product2;
			}
		}
		return null;
	}
	
	public String deleteProduct(int id)
	{
		for(Product product:products)
		{
			if(product.getId()==id)
			{
				products.remove(product);
				return "User Deleted Successfully";
			}
		}
		return null;
	}
}
