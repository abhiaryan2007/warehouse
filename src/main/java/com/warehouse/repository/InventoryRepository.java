package com.warehouse.repository;

import org.springframework.data.repository.CrudRepository;

import com.warehouse.dao.Inventory;


public interface InventoryRepository extends CrudRepository<Inventory, Long> {
	
	public Inventory findByName(String name);

	public Inventory findByStock(int stock);

	public Inventory findByArtId(Long art_id);
	
}
