package com.jc.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jc.entity.User2;
import com.jc.service.UserService;

@Controller 
public class UserControll {
	@Autowired
	private UserService userService;
	
	@RequestMapping("save")
	public String save(User2 user){
		userService.save(user);
		return "forward:findAll";
	}
	@RequestMapping("tosave")
	public String tosave(){
		return "add";
	}
	@RequestMapping("findAll")
	public String findAll(Model model){
		System.out.println(111);
		List<User2> users= userService.findAll();
		model.addAttribute("users", users);
		return "findall";
	}
	@RequestMapping("delete")
	public String delete(int uid){
		System.out.println(uid);
		userService.delete(uid);
		return "forward:findAll";
	}
	@RequestMapping("findById")
	public String findById(int uid,Model model){
		System.out.println(uid);
		User2 user= userService.findById(uid);
		model.addAttribute("user", user);
		return "update";
	}
	@RequestMapping("update")
	public String update(String password,String username,String sex,int uid){
		userService.update(password, username, sex, uid);
		return "forward:findAll";
	}
}
