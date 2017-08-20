package com.itheima.mybatis.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itheima.mybatis.po.User;

public class User_search {

	public static void main(String[] args) throws IOException {
		
		//���������ļ�
		  String resource = "sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//����mybatis�����ô���sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		//����SqlSessionFactory����SqlSession
		
		SqlSession session = sqlSessionFactory.openSession();
		
		 /**
		  * 1.ͨ��sqlSession��ѯ�û���Ϣ���������ݿ������
		  * 2.��һ������statement:ָ��mapperӳ���ļ���statement��id,ָ��ʱ��Ҫǰ�߼���statement�����������ռ�
		  * 3.�ڶ�������parameter:ָ���������
		  * 4.selectOne���ص��ǵ�����¼�����select���ض�����¼(list����),ʹ��selectOne�ᱨ��
		  * 5.����ӳ���ļ��е�resultTypeָ���������
		  */
		// User user = session.selectOne("test.findUserById",10);
		 
		
		  List<User> list = session.selectList("test.findUserList","��");
		  for(User user:list){
			  
			  System.out.println(user.toString());
		  }
		 //�����ѯ���
		 //System.out.println(user.toString());
		  
		  //�ر�����
		  session.close();
	}

}
