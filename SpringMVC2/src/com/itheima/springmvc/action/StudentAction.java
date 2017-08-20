package com.itheima.springmvc.action;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itheima.springmvc.pojo.Student;
import com.itheima.springmvc.pojo.UserModel;


/**
 * 
 * <p>Title: StudentAction</p>
 * <p>Description: 注解开发学生信息管理系统</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月6日下午11:09:00
 * @version 1.0
 */
@Controller
@RequestMapping("/stu")
public class StudentAction {

	
	
	 //学生信息查询
	
	   @RequestMapping(value="/querystudent")
	   public String queryStudent(Model model,
			                      @RequestParam(value="groupid",required=true,defaultValue="3") String group,UserModel userModel){
		   
		   
		   System.out.println("group="+group);
		   //创建一个集合，初始化一些数据
		   List<Student> stuList = new ArrayList<Student>();
		   
		     Student s1 =new Student();
		       s1.setId(1);
		       s1.setName("张三");
		       s1.setBirthday(new Date());
		       s1.setAge(25);
		       s1.setAddress("中国江苏");
		       
		     
		       Student s2 =new Student();
		       s2.setId(2);
		       s2.setName("李四");
		       s2.setBirthday(new Date());
		       s2.setAge(24);
		       s2.setAddress("中国浙江");
		       Student s3 =new Student();
		       s3.setId(3);
		       s3.setName("王五");
		       s3.setBirthday(new Date());
		       s3.setAge(23);
		       s3.setAddress("中国江苏");
		       Student s4=new Student();
		       s4.setId(4);
		       s4.setName("赵六");
		       s4.setBirthday(new Date());
		       s4.setAge(25);
		       s4.setAddress("中国广东");
		       
		       stuList.add(s1);
		       stuList.add(s2);
		       stuList.add(s3);
		       stuList.add(s4);
		       
		       
		       model.addAttribute("stuList",stuList);
		       
		       //返回逻辑视图
		       return "student/querystudent";
		     
		      
	   }
	 //修改学生信息页面
	
	    //可以限定请求为GET/Post,或者都可以，但是这样限定后，使用别的方式提交就会无效
	  @RequestMapping(value="/editstudent/{id}.action",method=RequestMethod.GET)
	  public String editstudent(Model model,HttpServletRequest request,@PathVariable String id)throws Exception{
		
		  System.out.println("request.getParanmeter="+request.getParameter("id"));
		  System.out.println("id="+id);
		  //使用静态数据
		  Student student = new Student();
		  student.setId(1);
		  student.setName("张三");
			 student.setAge(25);
			 student.setBirthday(new Date());
		  
			model.addAttribute("student",student);
		  //返回逻辑视图名
		return "student/editstudent";
		  
		  
		  
	  }
	//学生信息查询修改提交
	   @RequestMapping(value="/editstudentsubmit",method=RequestMethod.POST)
	   public String editstudentsubmit(String id_,UserModel userModel)throws Exception{
		   
		   System.out.println(id_);
		   System.out.println(userModel.getStudent().toString());
		   
		   //返回逻辑视图(成功页面)
		   // return "success";
		   
		    //请求重定向
		   //return "redirect:querystudent.action";
		   
		   //请求转发
		    return "forward:querystudent.action";
		   
	  
	   }
	   
	   
	   
	 //注册一个属性编辑器
		//如果不实现此方法，日期类型将不能转换
		@InitBinder
		protected void initBinder(HttpServletRequest request,
				ServletRequestDataBinder binder) throws Exception {
			
			
			//将student类中的birthday属性进行日期转换，类型和birthday一致
			
			 binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
		}
	 
	   
	      @RequestMapping("/deletestu")
		public String deletestu(String[] deleteid){
	    	  System.out.println(deleteid);
	    	  return "student/querystudent";
			
		}
	      

}
