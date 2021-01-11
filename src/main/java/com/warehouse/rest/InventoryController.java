package com.warehouse.rest;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.warehouse.dao.Inventory;
import com.warehouse.services.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	private InventoryService inventoryService;

	public InventoryController(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}

	
	@Autowired
	InventoryService service;

	/*
	 * @PostMapping(path = "/addItemToInventory",consumes =
	 * MediaType.APPLICATION_JSON_VALUE) public void addItemToInventory(@RequestBody
	 * Inventory inventory) { service.addItemToInventory(inventory); }
	 * 
	 * @GetMapping("/getInventoryByArticleName") public List<Inventory>
	 * getInventoryByArticleName(@RequestParam String articleName) { return
	 * service.getProductsList(); }
	 */
}
