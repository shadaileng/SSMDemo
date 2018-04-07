package com.qpf.service;

import java.util.List;

import com.qpf.model.User;

public interface UserService {
	
	public User getUser(int id);
	
	public List<User> getAllUser();
	
	public int updateUser(User user);
	
	public int deleteUser(User user);
	
	public int insertUser(User user);
}
