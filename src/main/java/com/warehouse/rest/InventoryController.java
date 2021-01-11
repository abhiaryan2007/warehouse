package com.warehouse.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.warehouse.dao.Inventory;
import com.warehouse.services.InventoryService;

@RestController
public class InventoryController {


	@Autowired
	InventoryService service;
	
	
		//GET all from inventory
		@RequestMapping("/inventory/{art_id}")
		public List<Inventory> getAllFromInventory() {
			return service.getAllFromInventory();
		}
	

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
