package common.biz;

import java.math.BigDecimal;
import java.util.List;

import modal.bean.SearchBean;
import modal.bean.User;

//用户业务相关--自定义需要的方法，使用到map中的语句
public interface UserBiz {
	//用户登录业务--根据参数类型判断  普通会员/管理员
//	public User login(String username,String password);
	public User login(User user);
	
	public int register(User user);  //注册
	
	public int updateUserIntegral(BigDecimal integral,String user_name);   //更新积分--新积分、用户名
	
	public List<User>userInfoList(SearchBean search);  //查找的用户的相关信息，不局限于用户实体
}
