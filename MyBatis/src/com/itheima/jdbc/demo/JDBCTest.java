package com.itheima.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;


/**
 * 
 * <p>Title: JDBCTest</p>
 * <p>Description: jdbc编程好处，速度快，操作方便，缺点：硬编码太多，不宜与扩展，每次操作，频繁开启与关闭connection </p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月8日下午10:48:27
 * @version 1.0
 */

public class JDBCTest {
	
	
	    public static void main(String[] args) {
	    	
	    	
	    	  //注册驱动
	    	   try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  //取得连接
	    	   
	    	   String url = "jdbc:mysql:///test";
	    	   String username="root";
	    	   String password="root";
	    	   
	    	  //取得连接
	    	   Connection conn=null;
	    	   
	    	   try {
				 conn = DriverManager.getConnection(url, username, password);
				
				 //预定义语句
				
				 String sql = "select* from student where sname=?";
				PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(sql);
				
				 preparedStatement.setString(1,"李军");
				 ResultSet rs = preparedStatement.executeQuery();
				  
				   
				 while(rs.next()){
					String sname = rs.getString("sname");
					String ssex = rs.getString("ssex");

			      System.out.println("姓名:"+sname+"性别:"+ssex);
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
				 if(conn!=null){
					 try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
			}
	    	   
	    	
	    	   
			
		}

}
