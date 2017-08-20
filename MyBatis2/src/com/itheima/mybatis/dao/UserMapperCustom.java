package com.itheima.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.itheima.mybatis.pojo.QueryNo;
import com.itheima.mybatis.pojo.User;

public interface UserMapperCustom {
	
	//查询用户列表
	public List<User> findUserList(QueryNo queryno)throws Exception;
	
	public  User selectUserByHashmap(Map map);
	
	//查询用户列表
	public int findUserCount(QueryNo queryno);
	//查询用户列表使用resultMap
	//List中的user是resultMap定义中的type(最终映射的java对象)
	public List<User> findUserListResultMap(QueryNo queryno);

}
