package com.itheima.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.itheima.mybatis.pojo.QueryNo;
import com.itheima.mybatis.pojo.User;

public interface UserMapperCustom {
	
	//��ѯ�û��б�
	public List<User> findUserList(QueryNo queryno)throws Exception;
	
	public  User selectUserByHashmap(Map map);
	
	//��ѯ�û��б�
	public int findUserCount(QueryNo queryno);
	//��ѯ�û��б�ʹ��resultMap
	//List�е�user��resultMap�����е�type(����ӳ���java����)
	public List<User> findUserListResultMap(QueryNo queryno);

}
