package com.itheima.mybatis.dao.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.itheima.mybatis.dao.OrderMapperCustom;
import com.itheima.mybatis.dao.UserMapper;
import com.itheima.mybatis.pojo.OrderCustom;
import com.itheima.mybatis.pojo.Orders;
import com.itheima.mybatis.pojo.User;

public class OrderMapperCustomTest {
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
	public void testfindOrdersUserList() throws Exception {
		  
		 //ȡ��sqlSession
		
		 SqlSession sqlSession = sqlSessionFactory.openSession();
		 
		 
		 OrderMapperCustom orderMapperCustom = sqlSession.getMapper(OrderMapperCustom.class);
		 
		List<OrderCustom> list = orderMapperCustom.findOrdersUserList();
		
		System.out.println("total:"+list.size());
	}
	 //����һ��һ
	@Test
	public void testfindOrdersUserListResultMap() throws Exception {
		
		//ȡ��sqlSession
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		
		OrderMapperCustom orderMapperCustom = sqlSession.getMapper(OrderMapperCustom.class);
		
		List<Orders> list = orderMapperCustom.findOrdersUserListResultMap();
		
		System.out.println("total:"+list.size());
	}
	
	  //����һ�Զ�
	  @Test
	  public void testfindOrderUserDetailList()throws Exception{
		
		//ȡ��sqlSession
			
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			
			OrderMapperCustom orderMapperCustom = sqlSession.getMapper(OrderMapperCustom.class);
			
			List<Orders> list = orderMapperCustom.findOrderUserDetailList();
			
			System.out.println("total:"+list.size());
		  
	  }
	  //���Զ�Զ�
	  @Test
	  public void testfindOrdersUserDetailItemList()throws Exception{
		  
		  //ȡ��sqlSession
		  
		  SqlSession sqlSession = sqlSessionFactory.openSession();
		  
		  
		  OrderMapperCustom orderMapperCustom = sqlSession.getMapper(OrderMapperCustom.class);
		  
		  List<Orders> list = orderMapperCustom.findOrdersUserDetailItemList();
		  
		  System.out.println("total:"+list.size());
		  
	  }
	    //�ӳټ���
	  @Test
	  public void testfindOrderList()throws Exception{
		  
		  //ȡ��sqlSession
		  
		  SqlSession sqlSession = sqlSessionFactory.openSession();
		  
		  
		  OrderMapperCustom orderMapperCustom = sqlSession.getMapper(OrderMapperCustom.class);
		  
		  List<Orders> list = orderMapperCustom.findOrderList();
		  
		     for(Orders orders:list){
		    	 
		    	 User user = orders.getUser();
		    	 
		    	 System.out.println(user.getUsername());
		     }
		  
		  System.out.println("total:"+list.size());
		  
	  }
	  
	  //����һ������
	   @Test
	   public void testCache1()throws Exception{
		   
		   //��ͬһ��sqlSession�в�ѯ�û�
		   SqlSession sqlSession = sqlSessionFactory.openSession();
		   
		   UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		   
		   //ִ��һ�β�ѯ
		    User user = userMapper.findUserById(1);
		    System.out.println(user);
		    
		      //ִ���û����£���ʱmybatis���һ������
		       //������¶���
		        User user_update = new User();
		        user_update.setId(1);
		        user_update.setUsername("��С��");
		        userMapper.updateUser(user_update);
		        //�ύ����
		        sqlSession.commit();
		     //ִ�еڶ��β�ѯ
		      User user1 = userMapper.findUserById(1);
		      System.out.println(user1);
		      
		      sqlSession.close();
		   
	   }
	   
	   
	    //���Զ�������
	   @Test
	   public void testCache2()throws Exception{
		   //��ͬһ��sqlSession�в�ѯ�û�
		   SqlSession  sqlSession1 = sqlSessionFactory.openSession();
		   
		   UserMapper userMapper1 =sqlSession1.getMapper(UserMapper.class);
		   
		   //��ͬһ��sqlSession�в�ѯ�û�
		     SqlSession sqlSession2 = sqlSessionFactory.openSession();
		     
		     UserMapper userMapper2  = sqlSession2.getMapper(UserMapper.class);
		     
		     //����һ��SqlSession���ڸ����û�
		     SqlSession sqlSession3 = sqlSessionFactory.openSession();
		     UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
		     
		     
		     //��sqlSession1�в�ѯ�û�
		      User user = userMapper1.findUserById(1);
		      System.out.println(user);
		      sqlSession1.close();
		      
		       //�����û�����
		       User user_update = new User();
		       user_update.setId(1);
		       user_update.setUsername("����");
		       userMapper3.updateUser(user_update);
		       
		       sqlSession3.commit();
		      
		      //��sqlSession2��ѯ�û�
		      User user2 = userMapper2.findUserById(1);
		      
		      System.out.println(user2);
		      sqlSession2.close();
		     
	   }

}
