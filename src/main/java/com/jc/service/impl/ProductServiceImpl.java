package com.jc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jc.dao.ProductDao;
import com.jc.entity.Product;
import com.jc.service.ProductService;

/**
 * 产品
 * @author 尤少辉
 * @日期 2018年6月25日
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		productDao.save(product);
	}

	@Override
	public void delete(int pid) {
		// TODO Auto-generated method stub
		productDao.delete(pid);
	}

	@Override
	@Modifying
	@Query("update t_product set pname=?1,price =?2,pimage=?3 where pid=?4")
	public void update(String pname,double price,String pimage,int pid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	@Override
	public Product findById(int pid) {
		// TODO Auto-generated method stub
		return productDao.findOne(pid);
	}

}
