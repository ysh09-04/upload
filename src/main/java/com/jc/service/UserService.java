package com.jc.service;

import java.util.List;

import com.jc.entity.User2;

public interface UserService {
	public void save(User2 user);
	public List<User2> findAll();
	public void delete(int uid);
	public User2 findById(int uid);
	public void update(String password,String username,String sex,int uid);
}
