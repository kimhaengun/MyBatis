package com.cos.mybatisex01.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.mybatisex01.model.Product;
import com.cos.mybatisex01.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ProductController {
	private final ProductRepository productRepository;
	
	@PostMapping("/product")
	public String save(@RequestBody Product product) {
		productRepository.save(product);
		return "ok";
	}
}
