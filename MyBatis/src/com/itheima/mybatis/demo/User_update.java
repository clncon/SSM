package com.itheima.mybatis.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itheima.mybatis.po.User;

/**
 * 
 * <p>Title: User_delete</p>
 * <p>Description: ����id�����û�</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��10������8:46:24
 * @version 1.0
 */
public class User_update {
   
	public static void main(String[] args) throws IOException {
		
		//���������ļ�
		  String resource = "sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//����mybatis�����ô���sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		//����SqlSessionFactory����SqlSession
		
		SqlSession session = sqlSessionFactory.openSession();
		
		 //�����û�
		 //�������
		 User user = new User();
		 
		  
		  user.setId(11);
		  user.setUsername("������");
		  user.setBirthday(new Date());
		  user.setAddress("�й��Ϻ�");
		  
		  //���user���е�����δ��д����ô�ͻᵼ����Ӧ�ֶ�ֵΪ��
		  //��������
		  session.update("test.updateUser", user);
		  
		  //�ύ����
		  session.commit();
		  
		  //�ر�����
		  session.close();
	}

}
