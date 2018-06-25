package com.jc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jc.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

}
