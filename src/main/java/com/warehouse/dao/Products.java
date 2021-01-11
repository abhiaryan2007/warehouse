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
	
	
	
}
