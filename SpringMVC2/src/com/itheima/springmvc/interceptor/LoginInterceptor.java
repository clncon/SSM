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
		
		    //判断请求的url是否公开，地址（无需登陆即可操作url）
		    //正常开发时，需要将公开地址配置在配置问阿金中
		    //取出请求的url
		     String url = request.getRequestURI();
		     
		     if(url.indexOf("loginsubmit.action")>=0){
		    	 //说明 公开地址
		    	 //放行
		    	  return true;
		     }
		     
		     
		     //取得session
		     HttpSession session = request.getSession();
		     
		     //从session取出用户身份信息
		     String userid = (String) session.getAttribute("userId");
		     
		     if(userid!=null){
		    	 //用户已经存在，放行
		    	 return true;
		     }
		     
		     //执行到这里说明，用户身份不合法，拦截，挑战
		     request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		      
		return false;
	}

}
