package com.itheima.spring.student.pojo;

import java.util.Date;

import org.springframework.jdbc.core.JdbcTemplate;

public class Student {
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", birthday="
				+ birthday + ", address=" + address + "]";
	}
	private String name;//����
	private Integer age;//����
	private Date birthday;//��ַ
	private String address;//��ַ
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
