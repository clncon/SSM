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
		 
		 //向页面显示一条提示信息
		 //下边的方法就相当于request。setAttribute(arg0,arg1);
		  modelAndView.addObject("message","helloworld!!");
		  
		  //指定jsp页面地址
		  //指定逻辑视图名
		 // modelAndView.setViewName("/WEB-INF/jsp/hello.jsp");
		  modelAndView.setViewName("hello");
		return modelAndView;
	}

}
