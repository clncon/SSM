package com.itheima.mybatis.dao;

import java.util.List;

import com.itheima.mybatis.po.User;

public interface UserDao {
	
	 public User findUserById(int id)throws Exception;
	 
	 //添加用户
	 public void insertUser(User user)throws Exception;
	 
	 //查询用户集合
	 
	 public List<User> findUserList()throws Exception;

}
