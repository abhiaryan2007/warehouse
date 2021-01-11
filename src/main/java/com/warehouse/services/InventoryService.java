package com.warehouse.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.warehouse.dao.Inventory;
import com.warehouse.repository.InventoryRepository;

@Service
@Repository
@Transactional
public class InventoryService {

	@Autowired
	InventoryRepository inventoryRepository;

	public Iterable<Inventory> list() {
		return inventoryRepository.findAll();
	}

	public List<Inventory> getAllFromInventory() {
		final List<Inventory> allInventory = new ArrayList<>();
		inventoryRepository.findAll().forEach(inventory -> allInventory.add(inventory));
		return allInventory;
	}

	public Iterable<Inventory> save(List<Inventory> inventoryValue) {
		return inventoryRepository.saveAll(inventoryValue);
	}

	public Inventory get(Long art_id) {
		// TODO Auto-generated method stub
		return inventoryRepository.findByArtId(art_id);
	}

	public void save(Inventory inventory) {
		inventoryRepository.save(inventory);
		
	}

}
