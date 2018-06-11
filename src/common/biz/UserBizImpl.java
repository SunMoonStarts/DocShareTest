package common.biz;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import controller.mapper.UserMapper;
import modal.bean.SearchBean;
import modal.bean.User;
import modal.common.MyBatisUtil;

//业务处理层---用户相关业务
public class UserBizImpl implements UserBiz{

	SqlSession session;
	UserMapper userMap;
	
	//用户登录业务
	@Override
	public User login(User users) {
		session=MyBatisUtil.getSession();
		System.out.println("session="+session);
		userMap=session.getMapper(UserMapper.class); //和 userMap.getClass() ? 比较
//		User user=userMap.findUser(username, password );
		User user=userMap.findUser(users);
		return user;
	}
	
//用户注册
	@Override
	public int register(User users) {
		session=MyBatisUtil.getSession();
		userMap=session.getMapper(UserMapper.class);
		User user=userMap.findUserByName(users);  //判断是否有相同用户名
		System.out.println("reg"+user);
		int res=2;   //存在相同的用户名，注册失败
		if(user==null) {  //没有相同名，可注册
			res=userMap.addUser(users);
		}
		session.commit();
		session.close();
		return res;
	}
//更新用户积分
	@Override
	public int updateUserIntegral(BigDecimal integral, String user_name) {
		int res = 0;

		return res;
	}

	@Override
	public List<User> userInfoList(SearchBean search) {
		
		List<User> userInfoList;
		userInfoList=userMap.findUserByCondition(search);
		
		return userInfoList;
	}
	
	

}
