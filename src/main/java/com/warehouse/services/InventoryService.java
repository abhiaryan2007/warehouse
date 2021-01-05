package com.warehouse.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.warehouse.dao.Inventory;
import com.warehouse.dao.PhoneCase;
import com.warehouse.dao.Products;
import com.warehouse.dao.ShoppingCart;
import com.warehouse.repository.InventoryRepository;
import com.warehouse.repository.PhoneShellRepository;
import com.warehouse.repository.ProductsRepository;
import com.warehouse.repository.ShoppingCartRepository;

@Component
public class InventoryService {
	
	
	@Autowired
	InventoryRepository inventoryRepository;
	
	public void addItemToInventory(Inventory inventory) {
		Products products = ProductsRepository.findByProductId(inventory.getArticleId());
		
		if(products==null) {
			throw new IllegalArgumentException("Product Doesnt exist for product ID"+inventory.getArticleId();
		}
		
		/*
		 * inventory.setCost(products.getCost().multiply(new
		 * BigDecimal(inventory.getQuantity()))); inventoryRepository.save(inventory);
		 */
	}
	
	public List<Inventory> getProductsList() {
		return  inventoryRepository.findByArticleName(articleName);
	}
}
