package com.itheima.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		
		    //�ж������url�Ƿ񹫿�����ַ�������½���ɲ���url��
		    //��������ʱ����Ҫ��������ַ�����������ʰ�����
		    //ȡ�������url
		     String url = request.getRequestURI();
		     
		     if(url.indexOf("loginsubmit.action")>=0){
		    	 //˵�� ������ַ
		    	 //����
		    	  return true;
		     }
		     
		     
		     //ȡ��session
		     HttpSession session = request.getSession();
		     
		     //��sessionȡ���û������Ϣ
		     String userid = (String) session.getAttribute("userId");
		     
		     if(userid!=null){
		    	 //�û��Ѿ����ڣ�����
		    	 return true;
		     }
		     
		     //ִ�е�����˵�����û���ݲ��Ϸ������أ���ս
		     request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		      
		return false;
	}

}
