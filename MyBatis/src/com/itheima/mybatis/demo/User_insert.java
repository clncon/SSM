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
		
		//���������ļ�
		  String resource = "sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//����mybatis�����ô���sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		//����SqlSessionFactory����SqlSession
		
		SqlSession session = sqlSessionFactory.openSession();
		
		
		//�������󣬲�������ֵ
		User user = new User();
		
		 user.setScore(78.5f);
		 user.setAddress("�й��Ϻ�");
		 user.setBirthday(new Date());
		 user.setSex("Ů");
		 user.setUsername("������");
		 
		 //�־û�����
		 
		 session.insert("test.insertUser",user);
		 
		 session.commit();
		 
		 //��ӡ����
		 System.out.println("id="+user.getId());
		 

	}

}
