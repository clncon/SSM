package com.itheima.springmvc.pojo;

import java.util.List;

/**
 * 
 * <p>Title: UserModel</p>
 * <p>Description: ������װstudent</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��7������6:14:12
 * @version 1.0
 */
public class UserModel {
	
	 //��װ����
	 private Student student;
	 
	 
	 //��װStudentScore
	 
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
