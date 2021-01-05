package com.warehouse.repository;

import org.springframework.data.repository.CrudRepository;

import com.warehouse.dao.Articles;


public interface InventoryRepository extends CrudRepository<Articles, Long> {
	
	public Articles findByArticleName(String articleName);
	
	public Articles findByarticleId(Long articleId);
	

}
