package cn.itcast.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.dao.mapper.UserMapper;
import cn.itcast.ssm.po.User;
import cn.itcast.ssm.service.UserService;

public class UserServiceImpl implements UserService{
	
	
	 //自动注入mapper
	@Autowired
	 private UserMapper userMapper;

	@Override
	public User findUserById(int id) throws Exception {
		 //调用mapper查询用户信息
		return userMapper.findUserById(1);
	}

	@Override
	public void saveUser() throws Exception {
		//更新用户
		
		User user_update = new User();
		user_update.setId(1);
		user_update.setUsername("张小小");
		
		userMapper.updateUser(user_update);
		
		//插入一个用户，插入一个重复的用户，让程序出错，看事务是否回滚
		
		
		User user_insert = new User();
		
		 user_insert.setId(2);
		 user_insert.setUsername("lalee ");
		 
		 userMapper.insertUser(user_insert);
		
	}

}
