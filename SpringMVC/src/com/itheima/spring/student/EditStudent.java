package com.itheima.spring.student;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.itheima.spring.student.pojo.Student;


public class EditStudent extends  AbstractCommandController{

	public EditStudent(){
		 //�����������
		this.setCommandClass(Student.class);
	}
	
	 //command:�����������ʹ���ϱ����õ�Student
	 //�������ͨ���βδ���
	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		 ModelAndView modelAndView = new ModelAndView();

		 //����service����
		 //������
		//ʹ�þ�̬����
		 Student student = new Student();
		 
		 student.setName("����");
		 student.setAge(25);
		 student.setBirthday(new Date());
		 
		 
		 //��Ҫ��ѧ����Ϣ����ҳ��
		  modelAndView.addObject("student",student);
		  
		  //�����޸�ѧ����Ϣҳ��
		    modelAndView.setViewName("student/editstudent");
		return modelAndView;
	}

}
