package cn.itcast.ssm.dao.old;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.itcast.ssm.po.User;

/**
 * 
 * <p>Title: UserDaoImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	�וF
 * @date	2017��8��17������9:07:09
 * @version 1.0
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	@Override
	public User findUserById(int id) throws Exception {
		  //����SqlSession
		SqlSession sqlSession = this.getSqlSession();
		return sqlSession.selectOne("test.findUserById",id);
	}
	
	

}
