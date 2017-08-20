package com.itheima.springmvc.pojo;

import java.util.List;

/**
 * 
 * <p>Title: UserModel</p>
 * <p>Description: 用来包装student</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月7日下午6:14:12
 * @version 1.0
 */
public class UserModel {
	
	 //包装对象
	 private Student student;
	 
	 
	 //包装StudentScore
	 
	 private List<StudentScore> scores;

	public UserModel() {
		super();
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<StudentScore> getScores() {
		return scores;
	}

	public void setScores(List<StudentScore> scores) {
		this.scores = scores;
	}

	
	 
	 
	

}
