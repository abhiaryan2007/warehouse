package com.warehouse.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.warehouse.dao.Articles;
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

	/*
	 * public List<Products> getAllArticles() { final List<Products> products = new
	 * ArrayList<>(); ProductsRepository.findByProductId(articleId) return products;
	 * }
	 * 
	 * public Articles getArticleByName(String articleName) { return
	 * ProductsRepository.findByProductId(articleId); }
	 */

	public static void save(List<Products> productsList) {
		// TODO Auto-generated method stub
		
	}

}
