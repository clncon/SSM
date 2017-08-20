package com.itheima.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;


/**
 * 
 * <p>Title: JDBCTest</p>
 * <p>Description: jdbc��̺ô����ٶȿ죬�������㣬ȱ�㣺Ӳ����̫�࣬��������չ��ÿ�β�����Ƶ��������ر�connection </p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��8������10:48:27
 * @version 1.0
 */

public class JDBCTest {
	
	
	    public static void main(String[] args) {
	    	
	    	
	    	  //ע������
	    	   try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  //ȡ������
	    	   
	    	   String url = "jdbc:mysql:///test";
	    	   String username="root";
	    	   String password="root";
	    	   
	    	  //ȡ������
	    	   Connection conn=null;
	    	   
	    	   try {
				 conn = DriverManager.getConnection(url, username, password);
				
				 //Ԥ�������
				
				 String sql = "select* from student where sname=?";
				PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(sql);
				
				 preparedStatement.setString(1,"���");
				 ResultSet rs = preparedStatement.executeQuery();
				  
				   
				 while(rs.next()){
					String sname = rs.getString("sname");
					String ssex = rs.getString("ssex");

			      System.out.println("����:"+sname+"�Ա�:"+ssex);
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
