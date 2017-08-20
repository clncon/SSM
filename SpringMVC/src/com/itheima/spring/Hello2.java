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
	
		        //向页面显示一行提示信息
				String message = "hellworld2";
			    request.setAttribute("message", message);
			    
			    //指定转向页面，使用request指定页面完整路径
			    request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);
		
	}

}
