package com.jc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jc.dao.UserDao;
import com.jc.entity.User2;
import com.jc.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	@Override
	public void save(User2 user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Override
	public List<User2> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public void delete(int uid) {
		// TODO Auto-generated method stub
		userDao.delete(uid);
	}

	@Override
	public User2 findById(int uid) {
		// TODO Auto-generated method stub
		return userDao.findOne(uid);
	}

	@Override
	@Modifying
	@Query("update t_user as t set password = ?1, t.username=?2,t.sex=?3 where uid= ?4")
	public void update(String password,String username,String sex,int uid ) {
		// TODO Auto-generated method stub
		
	}

}
