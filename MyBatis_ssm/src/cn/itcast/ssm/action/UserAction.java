package cn.itcast.ssm.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.po.User;
import cn.itcast.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserAction {

	 //注入userService
	
	 @Autowired
	 private UserService userService;
	 
	 
	 //查询用户信息
	  @RequestMapping("/queryUser")
	  public String queryUser(Model model,Integer id) throws Exception{
		  
		   //调用service
		  
		   User user = userService.findUserById(id);
		   
		   model.addAttribute("user", user);
		   
		   //返回逻辑视图名
		   return "queryUser";
		   
		  
	  }
}
