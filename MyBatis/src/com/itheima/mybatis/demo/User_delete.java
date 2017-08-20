package com.itheima.mybatis.demo;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 
 * <p>Title: User_delete</p>
 * <p>Description: 根据id删除用户</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月10日上午8:46:24
 * @version 1.0
 */
public class User_delete {
   
	public static void main(String[] args) throws IOException {
		
		//加载配置文件
		  String resource = "sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//根据mybatis的配置创建sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		//根据SqlSessionFactory创建SqlSession
		
		SqlSession session = sqlSessionFactory.openSession();
		
		//删除用户
	      session.delete("test.deleteUser", 10);
	      
	      //提交事务
	      
	       session.commit();
	       //关闭session
	       session.close();
		
	}

}
