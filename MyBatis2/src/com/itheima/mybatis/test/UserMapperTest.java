package com.itheima.mybatis.test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.itheima.mybatis.dao.UserMapper;
import com.itheima.mybatis.dao.UserMapperCustom;
import com.itheima.mybatis.pojo.User;
/**
 * 
 * <p>Title: UserDaoTest</p>
 * <p>Description:使用反射的方式开发Dao </p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月10日下午10:09:28
 * @version 1.0
 */
public class UserMapperTest {

	 private SqlSessionFactory sqlSessionFactory=null;
	 @Before
	 /**
	  * 
	  * <p>Title: SetSqlSessionFactory</p>
	  * <p>Description: 注入SqlSessionFactory</p>
	  * @throws Exception
	  */
	 public void SetSqlSessionFactory() throws Exception{
		 String resource = "sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		 sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
		 
		  
	 }
	 
	@Test
	public void testFindUserById() throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		
		 User user = userMapper.findUserById(5);
		 
		 System.out.println(user.toString());
		 
		
	}
	@Test
	public void testFindUserByMap() throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		UserMapperCustom userMapperCustom = session.getMapper(UserMapperCustom.class);
		
		 //准备参数
		    Map map = new HashMap();
		    map.put("id", 2);
		    map.put("username","张");
		User user = userMapperCustom.selectUserByHashmap(map);
		
		System.out.println(user.toString());
		
		
	}

}
