package com.masaischool.controller;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.masaischool.dto.Product;

@RestController
public class RestTemplateController {

	@GetMapping("/get_by_category/{category}")
	public ResponseEntity<List<Product>> getByCategory(@PathVariable String category){
		
		String url = "https://api.publicapis.org/"+category;
		
		RestTemplate template = new RestTemplate();
		
		ResponseEntity<List<Product>> entity = template.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Product>>() {}
        );

		
		return entity;
	}
	
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		
		String url = "https://api.publicapis.org/";
		
		RestTemplate template = new RestTemplate();
		
		return template.postForEntity(url, product, Product.class);
		
	}
	
	
}
