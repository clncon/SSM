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
		
		//加载配置文件
		  String resource = "sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//根据mybatis的配置创建sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		//根据SqlSessionFactory创建SqlSession
		
		SqlSession session = sqlSessionFactory.openSession();
		
		 /**
		  * 1.通过sqlSession查询用户信息（发起数据库操作）
		  * 2.第一个参数statement:指定mapper映射文件中statement的id,指定时需要前边加上statement所属的命名空间
		  * 3.第二个参数parameter:指定输入参数
		  * 4.selectOne返回的是单条记录，如果select返回多条记录(list集合),使用selectOne会报错
		  * 5.根据映射文件中的resultType指定输出类型
		  */
		// User user = session.selectOne("test.findUserById",10);
		 
		
		  List<User> list = session.selectList("test.findUserList","张");
		  for(User user:list){
			  
			  System.out.println(user.toString());
		  }
		 //输出查询结果
		 //System.out.println(user.toString());
		  
		  //关闭连接
		  session.close();
	}

}
