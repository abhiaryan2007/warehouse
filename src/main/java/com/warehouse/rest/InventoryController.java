package com.warehouse.rest;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	

		//Update inventory
		
		@PutMapping("/inventory/{id}")
		public ResponseEntity<?> update(@RequestBody Inventory inventory, @PathVariable Long id) {
		    try {
		        Inventory removeInventory = service.get(id);
		        service.save(inventory);
		        return new ResponseEntity<>(HttpStatus.OK);
		    } catch (NoSuchElementException e) {
		        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		    }      
		}
	
}
