package com.qpf.dao;

import com.qpf.model.User;

import java.util.List;
public interface UserMapper_ {
    public int insertUser_(User user);
    public int deleteUser_(User user);
    public int updateUser_(User user);
    public List<User> selectAllUser_();
    public User selectUserById_(int id);
}
