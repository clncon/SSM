/**
 * <p>Title: StudentMapperTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: www.itcast.cn</p>
 * @author 孔旻
 * @date 2017年8月19日下午8:03:17
 * @version 1.0
 */
package cn.itcast.ssm.dao.mapper.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ssm.dao.mapper.StudentMapper;
import cn.itcast.ssm.po.Student;
import cn.itcast.ssm.po.StudentExample;

/**
 * <p>Title: StudentMapperTest</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月19日下午8:03:17
 * @version 1.0
 */
public class StudentMapperTest {

	private  ApplicationContext applicationContext;
	private StudentMapper studentMapper;
	@Before
	public void setUp() throws Exception {
		
		
		applicationContext = new ClassPathXmlApplicationContext( new String[]{
			"spring/applicationContext-dao.xml",
			"spring/applicationContext.xml"
		 } );
		
		
		studentMapper = (StudentMapper) applicationContext.getBean("studentMapper");
	}
	
	
	
	 @Test
	 public void testInsert(){
		 
		 Student student = new Student();
		 
		 student.setName("李四");
		 student.setSex("女");
		 
		studentMapper.insert(student);
	 }

	/**
	 * Test method for {@link cn.itcast.ssm.dao.mapper.StudentMapper#deleteByExample(cn.itcast.ssm.po.StudentExample)}.
	 */
	@Test
	public void testDeleteByExample() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link cn.itcast.ssm.dao.mapper.StudentMapper#deleteByPrimaryKey(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link cn.itcast.ssm.dao.mapper.StudentMapper#selectByExample(cn.itcast.ssm.po.StudentExample)}.
	 */
	@Test
	public void testSelectByExample() {
		//自定义条件查询
		StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();		
        
        //拼接查询条件
        criteria.andSexEqualTo("男");//sex等于2
        criteria.andNameEqualTo("张三");//姓名等于王五
        
        //根据查询条件查询返回的集合对象
         List<Student> list =studentMapper.selectByExample(studentExample);
         
         System.out.println(list.size());
 	}

	/**
	 * Test method for {@link cn.itcast.ssm.dao.mapper.StudentMapper#selectByPrimaryKey(java.lang.Integer)}.
	 */
	@Test
	public void testSelectByPrimaryKey() {
		Student student = studentMapper.selectByPrimaryKey(1);
		System.out.println(student);
	}

	/**
	 * Test method for {@link cn.itcast.ssm.dao.mapper.StudentMapper#updateByExample(cn.itcast.ssm.po.Student, cn.itcast.ssm.po.StudentExample)}.
	 */
	@Test
	public void testUpdateByExample() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link cn.itcast.ssm.dao.mapper.StudentMapper#updateByPrimaryKey(cn.itcast.ssm.po.Student)}.
	 */
	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

}
