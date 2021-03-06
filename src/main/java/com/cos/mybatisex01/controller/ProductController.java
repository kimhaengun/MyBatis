package com.cos.mybatisex01.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@DeleteMapping("/product/{id}")
	public String deleteById(@PathVariable int id) {
		productRepository.deleteById(id);
		return "ok";
	}
	@PutMapping("/product/{id}")
	public String update(@PathVariable int id,@RequestBody Product product) {
		product.setId(id);
		productRepository.updateById(product);
		return "ok";
	}
	
	@GetMapping("/product")
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product findById(@PathVariable int id) {
		return productRepository.findById(id);
	}
	
}
