package com.jc.controll;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jc.entity.Product;
import com.jc.entity.User2;
import com.jc.service.ProductService;

@Controller
@RequestMapping("product")
public class ProductControll {
	
	@Resource
	private ProductService productService;
	@RequestMapping("save")
	public String save(Product product){
		productService.save(product);
		return "forward:findAll";
	}
	@RequestMapping("tosave")
	public String tosave(){
		return "addproduct";
	}
	@RequestMapping("findAll")
	public String findAll(Model model){
		List<Product> products= productService.findAll();
		model.addAttribute("products", products);
		return "findallproduct";
	}
	@RequestMapping("delete")
	public String delete(int pid){
		productService.delete(pid);
		return "forward:findAll";
	}
	@RequestMapping("findById")
	public String findById(int pid,Model model){
		Product product= productService.findById(pid);
		model.addAttribute("product", product);
		return "updateprocudt";
	}
	@RequestMapping("update")
	public String update(String pname,double price,String pimage,int pid){
		productService.update(pname, price, pimage, pid);
		return "forward:findAll";
	}
	@RequestMapping("update2")
	public String update2(String pname,double price,String pimage,int pid){
		productService.update(pname, price, pimage, pid);
		return "forward:findAll";
	}
}
