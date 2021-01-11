package com.warehouse.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.warehouse.dao.Products;
import com.warehouse.services.ProductsService;

@RestController
public class ProductsController {
	
	@Autowired
	ProductsService service;
	
	@PostMapping(path = "/products",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addProducts(@RequestBody Products products) {
		service.addProducts(products);
	}
	
	 @GetMapping("/getAllProducts/{id}") public List<Products> getAllFromProducts() {
	 return service.getAllFromProducts(); 
	 
	 }
	 
	 @DeleteMapping("/products/{id}")
	 public void delete(@PathVariable Integer id) {
	     service.delete(id);
	 }
	 

}
