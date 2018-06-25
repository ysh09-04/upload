package com.jc.service;

import java.util.List;

import com.jc.entity.Product;

/**
 * 产品
 * @author 尤少辉
 * @日期 2018年6月25日
 */
public interface ProductService {
	public void save(Product product);
	public void delete(int pid);
	public void update(String pname,double price,String pimage,int pid);
	public List<Product> findAll();
	public Product findById(int pid);
}
