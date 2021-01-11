package com.warehouse.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.warehouse.dao.Inventory;
import com.warehouse.dao.Products;
import com.warehouse.repository.InventoryRepository;
import com.warehouse.repository.ProductsRepository;

@Service
@Repository
@Transactional
public class InventoryService {

	@Autowired
	InventoryRepository inventoryRepository;
	
	public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public Iterable<Inventory> list() {
        return inventoryRepository.findAll();
    }

    public Iterable<Inventory> save(List<Inventory> inventoryValue) {
        return inventoryRepository.saveAll(inventoryValue);
    }
	
	}
