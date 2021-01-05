package com.warehouse.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.warehouse.dao.PhoneCase;
import com.warehouse.services.ProductsService;

@RestController
public class ProductsController {
	
	@Autowired
	ProductsService service;
	
	@PostMapping(path = "/products",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addProducts(@RequestBody Products products) {
		service.addProducts(products);
	}
	
	@GetMapping("/getAllProducts")
	public List<Products> getAllProducts() {
		return service.getAllCases();
	}
	
	@GetMapping("/getProductsByName")
	public Products getProductsByName(@RequestParam("productName") String pProductName ) {
		return service.getPhoneCaseByPhoneName(pPhoneName);
	}

}
