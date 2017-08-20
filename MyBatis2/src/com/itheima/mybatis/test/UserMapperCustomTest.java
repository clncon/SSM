package com.itheima.mybatis.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.itheima.mybatis.dao.UserMapperCustom;
import com.itheima.mybatis.pojo.QueryNo;
import com.itheima.mybatis.pojo.User;

public class UserMapperCustomTest {

	
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
	public void testfindUserList() throws Exception {
		
		
		    SqlSession session = sqlSessionFactory.openSession();
		    
		    
		    UserMapperCustom userMapperCustom = session.getMapper(UserMapperCustom.class);
		    
		     //���ò�ѯ����
		       User user = new User();
		       user.setSex("��");
		       user.setUsername("����");
		       
		      //������װ���󣬷����װ����
		       QueryNo queryno = new QueryNo();
		       
		        queryno.setUser(user);
		       
		    List<User> list = userMapperCustom.findUserList(queryno);
		    
		    System.out.println(list.size());
		
	}
	@Test
	public void testfindUserCount() throws Exception {
		
		
		SqlSession session = sqlSessionFactory.openSession();
		
		
		UserMapperCustom userMapperCustom = session.getMapper(UserMapperCustom.class);
		
		//���ò�ѯ����
		User user = new User();
		user.setId(3);
		user.setUsername("��");
		
		//������װ���󣬷����װ����
		QueryNo queryno = new QueryNo();
		
		queryno.setUser(user);
		
		int count = userMapperCustom.findUserCount(queryno);
		
		
		System.out.println("����:"+count);
	}
	@Test
	public void testFindUserCount() throws Exception {
		
		
		SqlSession session = sqlSessionFactory.openSession();
		
		
		UserMapperCustom userMapperCustom = session.getMapper(UserMapperCustom.class);
		
		//���ò�ѯ����
		User user = new User();
		user.setSex("��");
		user.setUsername("����");
		
		
		 //����һ������
		
		int[] ids = new int[3];
		 ids[0]=1;
		 ids[1]=5;
		 ids[2]=8;
		
		//������װ���󣬷����װ����
		QueryNo queryno = new QueryNo();
		
		queryno.setUser(user);
		queryno.setIds(ids);
		
		int count = userMapperCustom.findUserCount(queryno);
		
		
		System.out.println("����:"+count);
	}
	@Test
	public void findUserListResultMap() throws Exception {
		
		
		SqlSession session = sqlSessionFactory.openSession();
		
		
		UserMapperCustom userMapperCustom = session.getMapper(UserMapperCustom.class);
		
		//���ò�ѯ����
		User user = new User();
		user.setSex("��");
		user.setUsername("����");
		
		
		//����һ������
		
		int[] ids = new int[3];
		ids[0]=1;
		ids[1]=5;
		ids[2]=8;
		
		//������װ���󣬷����װ����
		QueryNo queryno = new QueryNo();
		
		queryno.setUser(user);
		queryno.setIds(ids);
		
	      List<User> list = userMapperCustom.findUserListResultMap(queryno);
		
		
		System.out.println("����:"+list.size());
	}

}
