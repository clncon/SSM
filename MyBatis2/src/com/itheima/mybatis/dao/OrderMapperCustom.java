package com.itheima.mybatis.dao;

import java.util.List;

import com.itheima.mybatis.pojo.OrderCustom;
import com.itheima.mybatis.pojo.Orderdetail;
import com.itheima.mybatis.pojo.Orders;
import com.itheima.mybatis.pojo.QueryNo;

/**
 * 
 * <p>Title: OrderMapperCustom</p>
 * <p>Description: mapper接口</p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月13日下午8:56:38
 * @version 1.0
 */
public interface OrderMapperCustom {

	  //查询订单及用户的信息 
	  public List<OrderCustom> findOrdersUserList()throws Exception;
	  
	  //查询订单及用户的信息
	  public List<Orders> findOrdersUserListResultMap()throws Exception;
	  
	  
	  //查询订单及订单明细
	  public List<Orders> findOrderUserDetailList()throws Exception;
	  
	  // 查询订单及订单明细信息及商品信息 
	  public List<Orders> findOrdersUserDetailItemList()throws Exception;
	  
	  //查询订单信息，实现延迟加载用户信息
	  public List<Orders> findOrderList()throws Exception;
}

 
