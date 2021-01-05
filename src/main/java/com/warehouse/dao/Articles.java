package com.warehouse.dao;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Articles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long articleId;
	
	private String articleName;
	private boolean in_stock=false;
	
	public Long getArticleId() {
		return articleId;
	}
	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public boolean isIn_stock() {
		return in_stock;
	}
	public void setIn_stock(boolean in_stock) {
		this.in_stock = in_stock;
	}
	
	
}
