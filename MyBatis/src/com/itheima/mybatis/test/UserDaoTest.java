package com.itheima.mybatis.test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.itheima.mybatis.dao.UserDao;
import com.itheima.mybatis.dao.impl.UserDaoImpl;
import com.itheima.mybatis.po.User;

/**
 * 
 * <p>Title: UserDaoTest</p>
 * <p>Description:原始方法开发Dao </p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月10日下午9:48:36
 * @version 1.0
 */
public class UserDaoTest {
	

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
	/**
	 * 
	 * <p>Title: testFindUserById</p>
	 * <p>Description: 根据id查询用户</p>
	 * @throws Exception
	 */
	public void testFindUserById() throws Exception {
		 //构造dao对象
		UserDao userdao = new UserDaoImpl(sqlSessionFactory);
		
		//调用查询方法
		
		  User user = userdao.findUserById(1);
		  
		  System.out.println(user.toString());
	}
	
	 @Test
	 public void testInsertUser() throws Exception{
		 //构造dao对象
		 UserDao userdao = new UserDaoImpl(sqlSessionFactory);
		 
		 User  user = new User();
		 
		 user.setScore(78f);
		 user.setAddress("中国湖南");
		 user.setBirthday(new Date());
		 user.setDetail("三好学生");
		 user.setSex("女");
		 user.setUsername("武书婷");
		 
		 userdao.insertUser(user);
		 
		  
		 
	 }
	 @Test
	 public void testFindUserList() throws Exception{
		 //构造dao对象
		 UserDao userdao = new UserDaoImpl(sqlSessionFactory);
		 
		 
		 List<User> list = userdao.findUserList();
		 
		 System.out.println(list.size());
	 }
	

}
