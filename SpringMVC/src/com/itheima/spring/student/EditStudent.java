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
		 //设置命令对象
		this.setCommandClass(Student.class);
	}
	
	 //command:命令对象，这里使用上边设置的Student
	 //命令对象，通过形参传递
	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		 ModelAndView modelAndView = new ModelAndView();

		 //调用service方法
		 //。。。
		//使用静态数据
		 Student student = new Student();
		 
		 student.setName("张三");
		 student.setAge(25);
		 student.setBirthday(new Date());
		 
		 
		 //需要将学生信息传到页面
		  modelAndView.addObject("student",student);
		  
		  //返回修改学生信息页面
		    modelAndView.setViewName("student/editstudent");
		return modelAndView;
	}

}
