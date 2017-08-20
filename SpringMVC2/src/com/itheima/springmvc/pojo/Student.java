package com.itheima.springmvc.pojo;

import java.util.Date;

public class Student {

	
	private Integer id;
	private String name;//姓名
	private Integer age;//年龄
	private Date birthday;//地址
	private String address;//地址
	
	private boolean userstate;
	
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public boolean isUserstate() {
		return userstate;
	}
	public void setUserstate(boolean userstate) {
		this.userstate = userstate;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", birthday=" + birthday + ", address=" + address
				+ ", userstate=" + userstate + "]";
	}
	
	
	
	
	
	
}
