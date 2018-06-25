package com.jc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 产品
 * @author 尤少辉
 * @日期 2018年6月25日
 */
@Entity
@Table(name="t_product")
public class Product {
	@Id
	@GeneratedValue
	private int pid;
	
	private String pname;
	private double price;
	private String pimage;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPimage() {
		return pimage;
	}
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
	public Product(int pid, String pname, double price, String pimage) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.pimage = pimage;
	}
	public Product() {
		super();
	}
	
}
