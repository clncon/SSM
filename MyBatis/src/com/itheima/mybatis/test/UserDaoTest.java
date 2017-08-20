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
 * <p>Description:ԭʼ��������Dao </p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��10������9:48:36
 * @version 1.0
 */
public class UserDaoTest {
	

	 private SqlSessionFactory sqlSessionFactory=null;
	 @Before
	 /**
	  * 
	  * <p>Title: SetSqlSessionFactory</p>
	  * <p>Description: ע��SqlSessionFactory</p>
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
	 * <p>Description: ����id��ѯ�û�</p>
	 * @throws Exception
	 */
	public void testFindUserById() throws Exception {
		 //����dao����
		UserDao userdao = new UserDaoImpl(sqlSessionFactory);
		
		//���ò�ѯ����
		
		  User user = userdao.findUserById(1);
		  
		  System.out.println(user.toString());
	}
	
	 @Test
	 public void testInsertUser() throws Exception{
		 //����dao����
		 UserDao userdao = new UserDaoImpl(sqlSessionFactory);
		 
		 User  user = new User();
		 
		 user.setScore(78f);
		 user.setAddress("�й�����");
		 user.setBirthday(new Date());
		 user.setDetail("����ѧ��");
		 user.setSex("Ů");
		 user.setUsername("������");
		 
		 userdao.insertUser(user);
		 
		  
		 
	 }
	 @Test
	 public void testFindUserList() throws Exception{
		 //����dao����
		 UserDao userdao = new UserDaoImpl(sqlSessionFactory);
		 
		 
		 List<User> list = userdao.findUserList();
		 
		 System.out.println(list.size());
	 }
	

}
