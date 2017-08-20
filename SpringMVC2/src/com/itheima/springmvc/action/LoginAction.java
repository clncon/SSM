package com.itheima.springmvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * <p>Title: LoginAction</p>
 * <p>Description: 系统登录</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月8日下午2:50:28
 * @version 1.0
 */
@Controller
public class LoginAction {
	
	
	
	      //登陆页面
	      @RequestMapping("/login")
	      public String login()throws Exception{
	    	  
	    	  
	    	  return "login";
	      }
	      
	      
	       //登陆提交
	       @RequestMapping("/loginsubmit")
	      public String loginsubmit(HttpSession session,String userid,String pwd)throws Exception{
	    	  
	    	    session.setAttribute("userId",userid);
	    	   
	    	   return "redirect:stu/querystudent.action";
	      }
	      
	      
	      //退出
	       @RequestMapping("/exit")
	      public String exit(HttpServletRequest request)throws Exception{
	    	   
	    	   //session过期
	    	   request.getSession().invalidate();
	    	   
	    	   
	    	   return "redirect:stu/querystudent.action";
	    	  
	      }
	       

}
