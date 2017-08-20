package com.itheima.mybatis.dao;

import java.util.List;

import com.itheima.mybatis.po.User;

public interface UserDao {
	
	 public User findUserById(int id)throws Exception;
	 
	 //����û�
	 public void insertUser(User user)throws Exception;
	 
	 //��ѯ�û�����
	 
	 public List<User> findUserList()throws Exception;

}
