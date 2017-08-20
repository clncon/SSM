package com.itheima.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.itheima.mybatis.dao.UserDao;
import com.itheima.mybatis.po.User;

/**
 * 
 * <p>Title: UserDaoImpl</p>
 * <p>Description: ԭʼ��Dao�Ŀ�������</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��10������9:40:54
 * @version 1.0
 */
public class UserDaoImpl implements UserDao{
    //ע��SqlSessionFactory
	private SqlSessionFactory sqlsessionFactory=null;
	
	
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
		this.sqlsessionFactory=sqlSessionFactory;
	}
	@Override
	public User findUserById(int id) throws Exception {
	
		SqlSession session = sqlsessionFactory.openSession();
		
		User user = session.selectOne("test.findUserById",id);
		return user;
	}
	@Override
	public void insertUser(User user) throws Exception {
		// TODO Auto-generated method stub
		SqlSession session = sqlsessionFactory.openSession();
         		
		session.insert("test.insertUser", user);
		
		session.commit();
		
		session.close();
	}
	@Override
	public List<User> findUserList() throws Exception {
		// TODO Auto-generated method stub
		SqlSession session = sqlsessionFactory.openSession();
		
		List<User> list = session.selectList("test.findUserList", "��");
		
		return list;
	}

}
