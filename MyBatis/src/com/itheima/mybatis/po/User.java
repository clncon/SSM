package com.itheima.mybatis.po;

import java.util.Date;

/**
 * 
 * <p>Title: User</p>
 * <p>Description: user琛ㄥ搴旂殑po绫�/p>
 * <p>Company: www.itcast.com</p> 
 * @author	浼犳櫤.鐕曢潚
 * @date	2014-12-17涓婂崍9:59:48
 * @version 1.0
 */
public class User {

	private int id;
	private String username;// 鐢ㄦ埛濮撳悕
	private String sex;// 鎬у埆
	private Date birthday;// 鍑虹敓鏃ユ湡
	private String address;// 鍦板潃
	private String detail;// 璇︾粏淇℃伅
	private Float score;// 鎴愮哗
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Float getScore() {
		return score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", sex=" + sex
				+ ", birthday=" + birthday + ", address=" + address
				+ ", detail=" + detail + ", score=" + score + "]";
	}
	
	
	

}
