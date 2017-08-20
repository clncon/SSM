package com.itheima.mybatis.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itheima.mybatis.po.User;

public class User_insert {

    public static void main(String[] args) throws IOException {
		
		//加载配置文件
		  String resource = "sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//根据mybatis的配置创建sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		//根据SqlSessionFactory创建SqlSession
		
		SqlSession session = sqlSessionFactory.openSession();
		
		
		//创建对象，并给对象赋值
		User user = new User();
		
		 user.setScore(78.5f);
		 user.setAddress("中国上海");
		 user.setBirthday(new Date());
		 user.setSex("女");
		 user.setUsername("吴舒婷");
		 
		 //持久化对象
		 
		 session.insert("test.insertUser",user);
		 
		 session.commit();
		 
		 //打印主键
		 System.out.println("id="+user.getId());
		 

	}

}
