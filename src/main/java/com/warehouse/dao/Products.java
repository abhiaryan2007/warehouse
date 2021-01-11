package com.warehouse.dao;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String name;
	private List<Articles> contain_articles;
	
	@Embedded
	private Articles articles;
	
	public Products ()
	{}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Articles> getContain_articles() {
		return contain_articles;
	}

	public void setContain_articles(List<Articles> contain_articles) {
		this.contain_articles = contain_articles;
	}

	public Articles getArticles() {
		return articles;
	}

	public void setArticles(Articles articles) {
		this.articles = articles;
	}
	
	
	
	
}
