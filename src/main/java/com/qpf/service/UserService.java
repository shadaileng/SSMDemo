package com.qpf.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qpf.dao.UserMapper_;
import com.qpf.model.User;

@Service("userService")
public class UserService {
	@Autowired
	private UserMapper_ mapper;
	
	public User getUser(int id) {
		return mapper.selectUserById_(id);
	}
	
	public List<User> getAllUser(){
		return mapper.selectAllUser_();
	}
	
}
