package com.masaischool.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	
	private String title;
	
	private String description;
	
	private String auth;

	private boolean https;
	
	private String cors;
	
	private String category;

	public Product(String title, String description, String auth, boolean https, String cors, String category) {
		super();
		this.title = title;
		this.description = description;
		this.auth = auth;
		this.https = https;
		this.cors = cors;
		this.category = category;
	}
	
	
	
	
	
	
	
}
