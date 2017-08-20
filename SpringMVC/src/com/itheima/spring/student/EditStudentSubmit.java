package com.itheima.spring.student;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.itheima.spring.student.pojo.Student;

public class EditStudentSubmit extends AbstractCommandController{

	 public EditStudentSubmit() {
		
		 this.setCommandClass(Student.class);
	}
	 
	//command�������������ʹ���ϱ����õ�Student
		//�������ͨ���βδ���
	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		ModelAndView  modelAndView = new ModelAndView();
		
		   //����service����ѧ����Ϣ
		    //...
		  //��������Խ�ҳ��Ĳ����ύ�����������
		    Student student = (Student) command;
		    
		    System.out.println(student.toString());
		    
		    System.out.println(student.getBirthday());
		    //���سɹ�ҳ��
		     modelAndView.setViewName("success");
		     
		return modelAndView;
	}


	
	 //ע��һ�����Ա༭��
	//�����ʵ�ִ˷������������ͽ�����ת��
	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		
		
		//��student���е�birthday���Խ�������ת�������ͺ�birthdayһ��
		
		 binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
	}
	   
}
