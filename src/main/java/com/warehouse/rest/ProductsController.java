package com.warehouse.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
	
	/*
	 * @GetMapping("/getAllProducts") public List<Products> getAllProducts() {
	 * return service.getAllProducts(); }
	 * 
	 * @GetMapping("/getProductsByName") public Products
	 * getProductsByName(@RequestParam("productName") String pProductName ) { return
	 * service.getProductsByName(pProductName); }
	 */

}
