package com.itheima.mybatis.dao;

import com.itheima.mybatis.pojo.User;

public interface UserMapper {
	
	 public User findUserById(int id)throws Exception;
	 public void updateUser(User user)throws Exception;

}
