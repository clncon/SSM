package cn.itcast.ssm.service;

import cn.itcast.ssm.po.User;

/**
 * 
 * <p>Title: UserService</p>
 * <p>Description:用户管理 </p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月19日上午10:53:35
 * @version 1.0
 */
public interface UserService {

	 User findUserById(int id)throws Exception;
	 void saveUser() throws Exception;
}
