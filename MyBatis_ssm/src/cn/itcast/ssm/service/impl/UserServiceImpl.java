package cn.itcast.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.dao.mapper.UserMapper;
import cn.itcast.ssm.po.User;
import cn.itcast.ssm.service.UserService;

public class UserServiceImpl implements UserService{
	
	
	 //�Զ�ע��mapper
	@Autowired
	 private UserMapper userMapper;

	@Override
	public User findUserById(int id) throws Exception {
		 //����mapper��ѯ�û���Ϣ
		return userMapper.findUserById(1);
	}

	@Override
	public void saveUser() throws Exception {
		//�����û�
		
		User user_update = new User();
		user_update.setId(1);
		user_update.setUsername("��СС");
		
		userMapper.updateUser(user_update);
		
		//����һ���û�������һ���ظ����û����ó�������������Ƿ�ع�
		
		
		User user_insert = new User();
		
		 user_insert.setId(2);
		 user_insert.setUsername("lalee ");
		 
		 userMapper.insertUser(user_insert);
		
	}

}
