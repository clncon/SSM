package cn.itcast.ssm.dao.old.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ssm.dao.old.UserDao;
import cn.itcast.ssm.po.User;

public class UserDaoImplTest {
	private  ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		
		
		applicationContext = new ClassPathXmlApplicationContext( new String[]{
			"spring/applicationContext-dao.xml",
			"spring/applicationContext.xml"
		 } );
	}

	@Test
	public void testFindUserByID() throws Exception {
		 UserDao userdao = (UserDao) applicationContext.getBean("userDao");
		 
		User user = userdao.findUserById(1);
		 
		 System.out.println(user);
	}

}
