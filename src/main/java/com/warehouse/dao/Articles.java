package com.warehouse.dao;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Articles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long art_Id;
	private int amountOf;
	private int in_stock;
	public Long getArt_Id() {
		return art_Id;
	}
	public void setArt_Id(Long art_Id) {
		this.art_Id = art_Id;
	}
	public int getAmountOf() {
		return amountOf;
	}
	public void setAmountOf(int amountOf) {
		this.amountOf = amountOf;
	}
	public int getIn_stock() {
		return in_stock;
	}
	public void setIn_stock(int in_stock) {
		this.in_stock = in_stock;
	}
	
	
	
}
