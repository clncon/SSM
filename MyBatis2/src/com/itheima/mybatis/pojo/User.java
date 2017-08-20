package com.itheima.mybatis.pojo;

import java.util.Date;
import java.util.List;

import javax.tools.JavaCompiler;

import org.apache.ibatis.type.Alias;

public class User implements java.io.Serializable {
	private int id;
	private int[] ids;//�洢���id
	private String username;// �û�����
	private String sex;// �Ա�
	private Date birthday;// ��������
	private String address;// ��ַ
	private String detail;// ��ϸ��Ϣ
	private Float score;// �ɼ�
	
	//������Ϣ
	private List<Orders> orders;
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
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	public int[] getIds() {
		return ids;
	}
	public void setIds(int[] ids) {
		this.ids = ids;
	}
	
	

	
	
}
