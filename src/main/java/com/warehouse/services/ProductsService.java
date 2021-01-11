package com.warehouse.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.warehouse.dao.Products;
import com.warehouse.repository.ProductsRepository;

@Component
@Service
@Repository
@Transactional
public class ProductsService {

	@Autowired
	ProductsRepository productsRepository;

	public void addProducts(Products products) {
		productsRepository.save(products);
	}

	public Iterable<Products> list() {
		return productsRepository.findAll();
	}

	public List<Products> getAllFromProducts() {
		final List<Products> allProducts = new ArrayList<>();
		productsRepository.findAll().forEach(products -> allProducts.add(products));
		return allProducts;
	}

	public Iterable<Products> saveIterable(List<Products> productsValue) {
		return productsRepository.saveAll(productsValue);
	}

	public void delete(Integer id) {
		productsRepository.deleteById(id);

	}

}
