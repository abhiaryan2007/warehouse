package com.warehouse.repository;

import org.springframework.data.repository.CrudRepository;

import com.warehouse.dao.Products;

public interface ProductsRepository extends CrudRepository<Products, Long> 
{

	public Products findByName(String name);

	public void deleteById(Integer id);

}
  
