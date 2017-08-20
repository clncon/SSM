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
 * <p>Description: ����idɾ���û�</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��10������8:46:24
 * @version 1.0
 */
public class User_delete {
   
	public static void main(String[] args) throws IOException {
		
		//���������ļ�
		  String resource = "sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//����mybatis�����ô���sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		//����SqlSessionFactory����SqlSession
		
		SqlSession session = sqlSessionFactory.openSession();
		
		//ɾ���û�
	      session.delete("test.deleteUser", 10);
	      
	      //�ύ����
	      
	       session.commit();
	       //�ر�session
	       session.close();
		
	}

}
