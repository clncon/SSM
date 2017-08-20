package com.itheima.mybatis.pojo;

public class QueryNo {
	
	
	//用户查询条件
	//为了查询条件扩展方便，基于Po的基础上自定义了的pojo,继承po
	private UserCoutom userCustom;
	
	private User user;
	
	private int[] ids;

	public UserCoutom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCoutom userCustom) {
		this.userCustom = userCustom;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int[] getIds() {
		return ids;
	}

	public void setIds(int[] ids) {
		this.ids = ids;
	}
	
	
	

}
