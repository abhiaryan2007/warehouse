package com.warehouse.rest;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.warehouse.dao.Inventory;
import com.warehouse.dao.PhoneCase;
import com.warehouse.dao.ShoppingCart;
import com.warehouse.services.InventoryService;

@RestController
public class InventoryController {

	@Autowired
	InventoryService service;
	
	@PostMapping(path = "/addItemToInventory",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addItemToInventory(@RequestBody Inventory inventory) {
		service.addItemToInventory(inventory);
	}
	
	@GetMapping("/getInventoryByArticleName")
	public List<Inventory> getInventoryByArticleName(@RequestParam String articleName) {
		return service.getProductsList();
	}
}
