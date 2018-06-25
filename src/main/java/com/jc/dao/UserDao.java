package com.jc.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jc.entity.User2;

public interface UserDao extends JpaRepository<User2, Integer>,Serializable{

}
