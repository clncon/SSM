package com.itheima.springmvc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.springmvc.pojo.Student;

/**
 * 
 * <p>Title: JsonAction</p>
 * <p>Description: Jsonת������</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��7������9:40:13
 * @version 1.0
 */
@Controller
public class JsonAction {
	
	
	 //1.����json��Ӧ��Ҳ��json
	 
	 @RequestMapping("/requestJson")
	 public @ResponseBody Student requestJson(@RequestBody Student student){
		 
		   System.out.println(student);
		return student;
		 
	 }

	 
	  //2.�������key/value����json
	 @RequestMapping("/responseJson")
	 public @ResponseBody Student responseJson(Student student){
		 
		 System.out.println(student);
		return student;
		 
	 }
}
