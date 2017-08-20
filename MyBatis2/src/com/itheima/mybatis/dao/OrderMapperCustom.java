package com.itheima.mybatis.dao;

import java.util.List;

import com.itheima.mybatis.pojo.OrderCustom;
import com.itheima.mybatis.pojo.Orderdetail;
import com.itheima.mybatis.pojo.Orders;
import com.itheima.mybatis.pojo.QueryNo;

/**
 * 
 * <p>Title: OrderMapperCustom</p>
 * <p>Description: mapper�ӿ�</p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��13������8:56:38
 * @version 1.0
 */
public interface OrderMapperCustom {

	  //��ѯ�������û�����Ϣ 
	  public List<OrderCustom> findOrdersUserList()throws Exception;
	  
	  //��ѯ�������û�����Ϣ
	  public List<Orders> findOrdersUserListResultMap()throws Exception;
	  
	  
	  //��ѯ������������ϸ
	  public List<Orders> findOrderUserDetailList()throws Exception;
	  
	  // ��ѯ������������ϸ��Ϣ����Ʒ��Ϣ 
	  public List<Orders> findOrdersUserDetailItemList()throws Exception;
	  
	  //��ѯ������Ϣ��ʵ���ӳټ����û���Ϣ
	  public List<Orders> findOrderList()throws Exception;
}

 
