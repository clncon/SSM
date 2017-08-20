package com.itheima.spring.student.pojo;

import java.util.Date;

import org.springframework.jdbc.core.JdbcTemplate;

public class Student {
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", birthday="
				+ birthday + ", address=" + address + "]";
	}
	private String name;//姓名
	private Integer age;//年龄
	private Date birthday;//地址
	private String address;//地址
	
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
