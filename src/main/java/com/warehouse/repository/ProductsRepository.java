package com.warehouse.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.warehouse.dao.Products;

public interface ProductsRepository extends CrudRepository<Products, Long> 
{

	static Products findByProductId(Long articleId) {
		// TODO Auto-generated method stub
		return null;
	}
	//List<Products> findbyProductsNaProducts

}
  
