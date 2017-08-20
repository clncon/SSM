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
 * <p>Description: 根据id更新用户</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月10日上午8:46:24
 * @version 1.0
 */
public class User_update {
   
	public static void main(String[] args) throws IOException {
		
		//加载配置文件
		  String resource = "sqlMapConfig.xml";
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//根据mybatis的配置创建sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		//根据SqlSessionFactory创建SqlSession
		
		SqlSession session = sqlSessionFactory.openSession();
		
		 //更新用户
		 //输入参数
		 User user = new User();
		 
		  
		  user.setId(11);
		  user.setUsername("武书婷");
		  user.setBirthday(new Date());
		  user.setAddress("中国上海");
		  
		  //如果user中有的属性未填写，那么就会导致相应字段值为空
		  //更新数据
		  session.update("test.updateUser", user);
		  
		  //提交事务
		  session.commit();
		  
		  //关闭连接
		  session.close();
	}

}
