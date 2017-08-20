package cn.itcast.ssm.dao.old;

import cn.itcast.ssm.po.User;

/**
 * 
 * <p>Title: UserDao</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	孔旻
 * @date	2017年8月17日下午9:05:43
 * @version 1.0
 */
public interface UserDao {

	 //根据用户id查询用户信息
	public User findUserById(int id)throws Exception;
	 
}
