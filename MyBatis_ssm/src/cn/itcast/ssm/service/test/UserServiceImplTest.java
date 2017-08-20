package cn.itcast.ssm.service.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ssm.po.User;
import cn.itcast.ssm.service.UserService;

public class UserServiceImplTest {
	private  ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		
		
		applicationContext = new ClassPathXmlApplicationContext( new String[]{
			"spring/applicationContext-dao.xml",
			"spring/applicationContext.xml",
			"spring/applicationContext-service.xml"
		 } );
	}

	@Test
	public void testFindUserById() throws Exception {
		
		
		UserService userService =  (UserService) applicationContext.getBean("userService");
		
		
		  User user = userService.findUserById(1);
		  
		  System.out.println(user);
		  
		  
	}
	@Test
	public void testSaveUser() throws Exception {
		
		
		UserService userService =  (UserService) applicationContext.getBean("userService");
		
		
		 userService.saveUser();
		
		//System.out.println(user);
		
		
	}

	
	
	
}
