package com.itheima.spring;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class Hello2 implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		        //��ҳ����ʾһ����ʾ��Ϣ
				String message = "hellworld2";
			    request.setAttribute("message", message);
			    
			    //ָ��ת��ҳ�棬ʹ��requestָ��ҳ������·��
			    request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);
		
	}

}
