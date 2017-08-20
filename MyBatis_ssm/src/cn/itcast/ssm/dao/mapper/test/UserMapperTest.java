package cn.itcast.ssm.dao.mapper.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ssm.dao.mapper.UserMapper;
import cn.itcast.ssm.po.User;

public class UserMapperTest {

	private  ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		
		
		applicationContext = new ClassPathXmlApplicationContext( new String[]{
			"spring/applicationContext-dao.xml",
			"spring/applicationContext.xml"
		 } );
	}
	@Test
	public void testFindUserById() throws Exception {
		 UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		 
		   User user=  userMapper.findUserById(1);
		   
		   System.out.println(user);
	}

}
