package com.warehouse.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.warehouse.dao.Articles;
import com.warehouse.dao.PhoneCase;
import com.warehouse.dao.Products;
import com.warehouse.repository.PhoneShellRepository;
import com.warehouse.repository.ProductsRepository;

@Component
public class ProductsService {

	@Autowired
	ProductsRepository productsRepository;

	public void addProducts(Products products) {
		productsRepository.save(products);
	}

	public List<Products> getAllArticles() {
		final List<Products> products = new ArrayList<>();
		ProductsRepository.findByProductId(articleId)
		return products;
	}
	
	public Articles getArticleByName(String articleName) {
		return ProductsRepository.findByProductId(articleId);
	}

}
