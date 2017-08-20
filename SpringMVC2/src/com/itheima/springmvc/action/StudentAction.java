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
 * <p>Description: ע�⿪��ѧ����Ϣ����ϵͳ</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��6������11:09:00
 * @version 1.0
 */
@Controller
@RequestMapping("/stu")
public class StudentAction {

	
	
	 //ѧ����Ϣ��ѯ
	
	   @RequestMapping(value="/querystudent")
	   public String queryStudent(Model model,
			                      @RequestParam(value="groupid",required=true,defaultValue="3") String group,UserModel userModel){
		   
		   
		   System.out.println("group="+group);
		   //����һ�����ϣ���ʼ��һЩ����
		   List<Student> stuList = new ArrayList<Student>();
		   
		     Student s1 =new Student();
		       s1.setId(1);
		       s1.setName("����");
		       s1.setBirthday(new Date());
		       s1.setAge(25);
		       s1.setAddress("�й�����");
		       
		     
		       Student s2 =new Student();
		       s2.setId(2);
		       s2.setName("����");
		       s2.setBirthday(new Date());
		       s2.setAge(24);
		       s2.setAddress("�й��㽭");
		       Student s3 =new Student();
		       s3.setId(3);
		       s3.setName("����");
		       s3.setBirthday(new Date());
		       s3.setAge(23);
		       s3.setAddress("�й�����");
		       Student s4=new Student();
		       s4.setId(4);
		       s4.setName("����");
		       s4.setBirthday(new Date());
		       s4.setAge(25);
		       s4.setAddress("�й��㶫");
		       
		       stuList.add(s1);
		       stuList.add(s2);
		       stuList.add(s3);
		       stuList.add(s4);
		       
		       
		       model.addAttribute("stuList",stuList);
		       
		       //�����߼���ͼ
		       return "student/querystudent";
		     
		      
	   }
	 //�޸�ѧ����Ϣҳ��
	
	    //�����޶�����ΪGET/Post,���߶����ԣ����������޶���ʹ�ñ�ķ�ʽ�ύ�ͻ���Ч
	  @RequestMapping(value="/editstudent/{id}.action",method=RequestMethod.GET)
	  public String editstudent(Model model,HttpServletRequest request,@PathVariable String id)throws Exception{
		
		  System.out.println("request.getParanmeter="+request.getParameter("id"));
		  System.out.println("id="+id);
		  //ʹ�þ�̬����
		  Student student = new Student();
		  student.setId(1);
		  student.setName("����");
			 student.setAge(25);
			 student.setBirthday(new Date());
		  
			model.addAttribute("student",student);
		  //�����߼���ͼ��
		return "student/editstudent";
		  
		  
		  
	  }
	//ѧ����Ϣ��ѯ�޸��ύ
	   @RequestMapping(value="/editstudentsubmit",method=RequestMethod.POST)
	   public String editstudentsubmit(String id_,UserModel userModel)throws Exception{
		   
		   System.out.println(id_);
		   System.out.println(userModel.getStudent().toString());
		   
		   //�����߼���ͼ(�ɹ�ҳ��)
		   // return "success";
		   
		    //�����ض���
		   //return "redirect:querystudent.action";
		   
		   //����ת��
		    return "forward:querystudent.action";
		   
	  
	   }
	   
	   
	   
	 //ע��һ�����Ա༭��
		//�����ʵ�ִ˷������������ͽ�����ת��
		@InitBinder
		protected void initBinder(HttpServletRequest request,
				ServletRequestDataBinder binder) throws Exception {
			
			
			//��student���е�birthday���Խ�������ת�������ͺ�birthdayһ��
			
			 binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
		}
	 
	   
	      @RequestMapping("/deletestu")
		public String deletestu(String[] deleteid){
	    	  System.out.println(deleteid);
	    	  return "student/querystudent";
			
		}
	      

}
