package cn.itcast.ssm.dao.old;

import cn.itcast.ssm.po.User;

/**
 * 
 * <p>Title: UserDao</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��17������9:05:43
 * @version 1.0
 */
public interface UserDao {

	 //�����û�id��ѯ�û���Ϣ
	public User findUserById(int id)throws Exception;
	 
}
