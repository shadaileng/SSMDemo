package com.qpf.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qpf.orm.UserMapper;
import com.qpf.service.UserService;
import com.qpf.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mapper;
	
	@Override
	public User getUser(int id) {
		return mapper.selectUserById(id);
	}
	
	@Override
	public List<User> getAllUser(){
		return mapper.selectAllUser();
	}
	
	@Override
	public int updateUser(User user) {
		int res = 0;
		
		res = mapper.updateUser(user);
		
		return res;
	}

	@Override
	public int deleteUser(User user) {
		int res = 0;
		
		res = mapper.deleteUser(user);
		
		return res;
	}

	@Override
	public int insertUser(User user) {
		int res = 0;
		
		res = mapper.insertUser(user);
		
		return res;
	}
	
}
