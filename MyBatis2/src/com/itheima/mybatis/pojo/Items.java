package com.itheima.mybatis.pojo;

/**
 * ��Ʒ��Ϣ
 * @author Thinkpad
 *
 */
public class Items {
	private int id;////��Ʒid
	private String item_name;//��Ʒ����
	private Float item_price;//��Ʒ�۸�
	private String item_detail;//��Ʒ��ϸ
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public Float getItem_price() {
		return item_price;
	}
	public void setItem_price(Float item_price) {
		this.item_price = item_price;
	}
	public String getItem_detail() {
		return item_detail;
	}
	public void setItem_detail(String item_detail) {
		this.item_detail = item_detail;
	}
	
	
}
