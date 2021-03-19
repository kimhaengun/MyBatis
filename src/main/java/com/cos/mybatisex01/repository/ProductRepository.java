package com.cos.mybatisex01.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.cos.mybatisex01.model.Product;

@Mapper
 // Mapper = interface 구현한것을 IOC에 띄워준다.
public interface ProductRepository {
	public void save(Product product);
	public void deleteById(int id);
	public void updateById(Product product);
}
