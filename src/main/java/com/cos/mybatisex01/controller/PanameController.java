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
import com.cos.mybatisex01.model.beans.PanameBean;
import com.cos.mybatisex01.repository.PanameRepository;
import com.cos.mybatisex01.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class PanameController {
	
	private final PanameRepository panameRepository;
	
	@GetMapping("/paname/{id}")
	public PanameBean findByIdAndJoin(@PathVariable int id) {
		return panameRepository.findByIdAndJoin(id);
	}
	
}
