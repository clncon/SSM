package com.itheima.springmvc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.springmvc.pojo.Student;

/**
 * 
 * <p>Title: JsonAction</p>
 * <p>Description: Json转换测试</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月7日下午9:40:13
 * @version 1.0
 */
@Controller
public class JsonAction {
	
	
	 //1.请求json相应的也是json
	 
	 @RequestMapping("/requestJson")
	 public @ResponseBody Student requestJson(@RequestBody Student student){
		 
		   System.out.println(student);
		return student;
		 
	 }

	 
	  //2.请求的是key/value反回json
	 @RequestMapping("/responseJson")
	 public @ResponseBody Student responseJson(Student student){
		 
		 System.out.println(student);
		return student;
		 
	 }
}
