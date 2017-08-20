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
	  * <p>Description: 注入SqlSessionFactory</p>
	  * @throws Exception
	  */
	 public void SetSqlSessionFactory() throws Exception{
		 String resource = "sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		 sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
		 
		  
	 }
	@Test
	public void testfindOrdersUserList() throws Exception {
		  
		 //取得sqlSession
		
		 SqlSession sqlSession = sqlSessionFactory.openSession();
		 
		 
		 OrderMapperCustom orderMapperCustom = sqlSession.getMapper(OrderMapperCustom.class);
		 
		List<OrderCustom> list = orderMapperCustom.findOrdersUserList();
		
		System.out.println("total:"+list.size());
	}
	 //测试一对一
	@Test
	public void testfindOrdersUserListResultMap() throws Exception {
		
		//取得sqlSession
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		
		OrderMapperCustom orderMapperCustom = sqlSession.getMapper(OrderMapperCustom.class);
		
		List<Orders> list = orderMapperCustom.findOrdersUserListResultMap();
		
		System.out.println("total:"+list.size());
	}
	
	  //测试一对多
	  @Test
	  public void testfindOrderUserDetailList()throws Exception{
		
		//取得sqlSession
			
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			
			OrderMapperCustom orderMapperCustom = sqlSession.getMapper(OrderMapperCustom.class);
			
			List<Orders> list = orderMapperCustom.findOrderUserDetailList();
			
			System.out.println("total:"+list.size());
		  
	  }
	  //测试多对多
	  @Test
	  public void testfindOrdersUserDetailItemList()throws Exception{
		  
		  //取得sqlSession
		  
		  SqlSession sqlSession = sqlSessionFactory.openSession();
		  
		  
		  OrderMapperCustom orderMapperCustom = sqlSession.getMapper(OrderMapperCustom.class);
		  
		  List<Orders> list = orderMapperCustom.findOrdersUserDetailItemList();
		  
		  System.out.println("total:"+list.size());
		  
	  }
	    //延迟加载
	  @Test
	  public void testfindOrderList()throws Exception{
		  
		  //取得sqlSession
		  
		  SqlSession sqlSession = sqlSessionFactory.openSession();
		  
		  
		  OrderMapperCustom orderMapperCustom = sqlSession.getMapper(OrderMapperCustom.class);
		  
		  List<Orders> list = orderMapperCustom.findOrderList();
		  
		     for(Orders orders:list){
		    	 
		    	 User user = orders.getUser();
		    	 
		    	 System.out.println(user.getUsername());
		     }
		  
		  System.out.println("total:"+list.size());
		  
	  }
	  
	  //测试一级缓存
	   @Test
	   public void testCache1()throws Exception{
		   
		   //在同一个sqlSession中查询用户
		   SqlSession sqlSession = sqlSessionFactory.openSession();
		   
		   UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		   
		   //执行一次查询
		    User user = userMapper.findUserById(1);
		    System.out.println(user);
		    
		      //执行用户更新，此时mybatis清除一级缓存
		       //构造更新对象
		        User user_update = new User();
		        user_update.setId(1);
		        user_update.setUsername("张小三");
		        userMapper.updateUser(user_update);
		        //提交事务
		        sqlSession.commit();
		     //执行第二次查询
		      User user1 = userMapper.findUserById(1);
		      System.out.println(user1);
		      
		      sqlSession.close();
		   
	   }
	   
	   
	    //测试二级缓存
	   @Test
	   public void testCache2()throws Exception{
		   //在同一个sqlSession中查询用户
		   SqlSession  sqlSession1 = sqlSessionFactory.openSession();
		   
		   UserMapper userMapper1 =sqlSession1.getMapper(UserMapper.class);
		   
		   //在同一个sqlSession中查询用户
		     SqlSession sqlSession2 = sqlSessionFactory.openSession();
		     
		     UserMapper userMapper2  = sqlSession2.getMapper(UserMapper.class);
		     
		     //创建一个SqlSession用于更新用户
		     SqlSession sqlSession3 = sqlSessionFactory.openSession();
		     UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
		     
		     
		     //从sqlSession1中查询用户
		      User user = userMapper1.findUserById(1);
		      System.out.println(user);
		      sqlSession1.close();
		      
		       //更新用户操作
		       User user_update = new User();
		       user_update.setId(1);
		       user_update.setUsername("张三");
		       userMapper3.updateUser(user_update);
		       
		       sqlSession3.commit();
		      
		      //从sqlSession2查询用户
		      User user2 = userMapper2.findUserById(1);
		      
		      System.out.println(user2);
		      sqlSession2.close();
		     
	   }

}
