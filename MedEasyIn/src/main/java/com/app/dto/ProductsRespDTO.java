package com.app.dto;

import java.time.LocalDate;

public class ProductsRespDTO {
	private String name;
	private Double price;
	private String description;
	private Integer stock;
	private String imagePath;
	private LocalDate expDate;

	/*{"name":"Crocine","price":"12.0","description":"Fever Tablet","stock":"500","categoryId":"1","imagePath":"images/kiara.jpg"}*/
	
	
	


	public ProductsRespDTO() {
		super();
		System.out.println("in ctor "+getClass().getName());
	}


	public ProductsRespDTO(String name, Double price, String description, Integer stock, LocalDate expDate) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.stock = stock;
		this.expDate=expDate;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public LocalDate getExpDate() {
		return expDate;
	}


	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	


	

}
