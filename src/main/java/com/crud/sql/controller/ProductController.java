package com.crud.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.sql.dto.Product;
import com.crud.sql.service.ProductServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductServiceImpl cashServiceImpl;
	
	@GetMapping("/products")
	public List<Product> listProducts(){
		return cashServiceImpl.listProducts();
	}
	
	
	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		
		return cashServiceImpl.saveProduct(product);
	}
	
	
	@GetMapping("/products/{code}")
	public Product cashXID(@PathVariable(name="code") int code) {
		
		Product product_xid= new Product();		
		product_xid=cashServiceImpl.productXID(code);
	
		return product_xid;
	}
	
	@PutMapping("/products/{code}")
	public Product updateProduct(@PathVariable(name="code")int code,@RequestBody Product product) {
		
		Product selected_product= new Product();
		Product updated_product= new Product();
		
		selected_product= cashServiceImpl.productXID(code);
		
		selected_product.setName(product.getName());
		selected_product.setPrice(product.getPrice());
		
		updated_product = cashServiceImpl.updateProduct(selected_product);
		
		return updated_product;
	}
	
	@DeleteMapping("/products/{code}")
	public void eliminateProduct(@PathVariable(name="code")int code) {
		cashServiceImpl.eliminateProduct(code);
	}

}
