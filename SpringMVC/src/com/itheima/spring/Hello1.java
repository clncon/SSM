package com.itheima.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Hello1 implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
		 ModelAndView modelAndView = new ModelAndView();
		 
		 //��ҳ����ʾһ����ʾ��Ϣ
		 //�±ߵķ������൱��request��setAttribute(arg0,arg1);
		  modelAndView.addObject("message","helloworld!!");
		  
		  //ָ��jspҳ���ַ
		  //ָ���߼���ͼ��
		 // modelAndView.setViewName("/WEB-INF/jsp/hello.jsp");
		  modelAndView.setViewName("hello");
		return modelAndView;
	}

}
