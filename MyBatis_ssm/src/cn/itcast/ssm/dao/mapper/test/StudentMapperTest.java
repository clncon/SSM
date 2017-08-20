/**
 * <p>Title: StudentMapperTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: www.itcast.cn</p>
 * @author �וF
 * @date 2017��8��19������8:03:17
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
 * @author	�וF
 * @date	2017��8��19������8:03:17
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
		 
		 student.setName("����");
		 student.setSex("Ů");
		 
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
		//�Զ���������ѯ
		StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();		
        
        //ƴ�Ӳ�ѯ����
        criteria.andSexEqualTo("��");//sex����2
        criteria.andNameEqualTo("����");//������������
        
        //���ݲ�ѯ������ѯ���صļ��϶���
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
