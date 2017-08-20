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

	 //ע��userService
	
	 @Autowired
	 private UserService userService;
	 
	 
	 //��ѯ�û���Ϣ
	  @RequestMapping("/queryUser")
	  public String queryUser(Model model,Integer id) throws Exception{
		  
		   //����service
		  
		   User user = userService.findUserById(id);
		   
		   model.addAttribute("user", user);
		   
		   //�����߼���ͼ��
		   return "queryUser";
		   
		  
	  }
}
