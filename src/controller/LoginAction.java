package controller;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import modal.bean.User;
import modal.dao.DBUtilTool;

public class LoginAction extends BaseAction{

	
	private String username;
	private String password;
	private String vcode;
	
	private User user;
	private QueryRunner qr;

	public String execute() throws SQLException {

		//验证码
		Object imageCode=sessionMap.get("imageCode"); 
		//验证码输入错误---忽略大小写
		if( !(imageCode.toString().toLowerCase().equals(vcode.toLowerCase())) ) {
			
			return "input";  //登录失败，跳转登录页
//			return "test";  //测试ognl
		}
		qr = DBUtilTool.getQueryRunner(); // 获取对象
		// 数据库中进行判断
		String sql = "select * from tb_user where user_name=? and user_pwd=?";
		user = qr.query(sql, new BeanHandler<User>(User.class), username, password);
		System.out.println("user=" + user);
		
		if (user != null) { // 登录成功
			return "success";
		} else if (user == null) {
			return "input";  //登录失败，跳转登录页
		} 
		
		return "error";
	}
	
	//后台登录
	public String adminLogin() {
		
		System.out.println("username="+username+" pwd="+password);
		qr = DBUtilTool.getQueryRunner(); // 获取对象
		// 数据库中进行判断
		/*String sql = "select * from tb_user where user_name=? and user_pwd=?";
		user = qr.query(sql, new BeanHandler<User>(User.class), username, password);
		System.out.println("user=" + user);
		
		if (user != null) { // 登录成功
			return "success";
		} else if (user == null) {
			return "input";  //登录失败，跳转登录页
		} 
		
		return "error";*/
		if(username.equals("麻瓜") && password.equals("1234")) {
			
			
			return "admin-login"; 
		}
		return "admin-error";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public String getVcode() {
		return vcode;
	}

	public void setVcode(String vcode) {
		this.vcode = vcode;
	}

	

}
