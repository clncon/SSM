package cn.itcast.ssm.service;

import cn.itcast.ssm.po.User;

/**
 * 
 * <p>Title: UserService</p>
 * <p>Description:�û����� </p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��19������10:53:35
 * @version 1.0
 */
public interface UserService {

	 User findUserById(int id)throws Exception;
	 void saveUser() throws Exception;
}
