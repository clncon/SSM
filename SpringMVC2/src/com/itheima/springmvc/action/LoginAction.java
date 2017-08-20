package com.itheima.springmvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * <p>Title: LoginAction</p>
 * <p>Description: ϵͳ��¼</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��8������2:50:28
 * @version 1.0
 */
@Controller
public class LoginAction {
	
	
	
	      //��½ҳ��
	      @RequestMapping("/login")
	      public String login()throws Exception{
	    	  
	    	  
	    	  return "login";
	      }
	      
	      
	       //��½�ύ
	       @RequestMapping("/loginsubmit")
	      public String loginsubmit(HttpSession session,String userid,String pwd)throws Exception{
	    	  
	    	    session.setAttribute("userId",userid);
	    	   
	    	   return "redirect:stu/querystudent.action";
	      }
	      
	      
	      //�˳�
	       @RequestMapping("/exit")
	      public String exit(HttpServletRequest request)throws Exception{
	    	   
	    	   //session����
	    	   request.getSession().invalidate();
	    	   
	    	   
	    	   return "redirect:stu/querystudent.action";
	    	  
	      }
	       

}
