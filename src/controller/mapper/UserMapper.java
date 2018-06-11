package controller.mapper;

import java.math.BigDecimal;
import java.util.List;

import modal.bean.SearchBean;
import modal.bean.User;

//映射实体类文件里的具体的sql-map--所有和实体类(用户表)配置文件(user.xml)有关的SQL语句

public interface UserMapper {
	//查找用户,根据类型判断是否为管理员--登录
	public User findUser(User user); 
	public User findUserByName(User user); 
	public List<User>findUserByCondition(SearchBean search);
	
	public int addUser(User user);   //新增
	
	public int updateUserIntegral(BigDecimal integral,String user_name); //更新积分
	
	
	
}