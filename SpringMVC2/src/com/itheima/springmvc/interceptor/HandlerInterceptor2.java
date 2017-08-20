package com.itheima.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class HandlerInterceptor2 implements HandlerInterceptor{

	 //ִ��ʱ��:Handler����ִ����ɣ�(modelAndView�Ѿ�����)
	 //ʹ�ó���:ͳһ�쳣����ͳһ��¼ϵͳ��־������action����ִ�м��
	 //����preHandle��¼һ��ʱ��㣬��afterCompletion��¼ִ�н���ʱ��㣬������ʱ����ȥ��ʼʱ��㣬�õ�ִ��ʱ����
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		 System.out.println("HandlerInterceptor--->>afeterCompletion2");
		
	}

	 //ִ��ʱ��:����Handler����֮���ٷ���ModelAndView֮ǰ
	 //ʹ�ó���:ʹ��modelAndView,��ҳ�洫��ͨ�����ݣ�ʹ��ͳһ��view
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView modelAndView) throws Exception {
	
		 System.out.println("HandlerInterceptor-->>postHandler2");
		
	}

	 //hanlder:springmvc����url�ҵ�Handler(ֻ��һ������)
	 //ִ��ʱ��������Handler����֮ǰִ�У��������false����ʾ���أ��������true��ʾ����
	 //ʹ�ó���:�����û����У�飬�û�Ȩ������У��
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
	
		 System.out.println("HandlerInterceptor1-->>preHandler2");
		return true;
	}
	
	
	 

}
