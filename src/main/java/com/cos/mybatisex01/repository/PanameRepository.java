package com.cos.mybatisex01.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.cos.mybatisex01.model.Product;
import com.cos.mybatisex01.model.beans.PanameBean;

@Mapper
 // Mapper = interface 구현한것을 IOC에 띄워준다.
public interface PanameRepository {
	public PanameBean findByIdAndJoin(int id);
}
