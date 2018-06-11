package controller;

import java.math.BigDecimal;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import modal.bean.User;
import modal.dao.DBUtilTool;

public class RegisterAction {

	/*private String username;
	private String password;
	private String education; //学历
	private String profession;   //职业
	private Object telephone;
	private String email;*/
	private User user;
	public QueryRunner qr=DBUtilTool.getQueryRunner();

	public String execute() {
		try {
//			System.out.println("username=" + username + " password=" + password+" telephone="+telephone+" email="+email);
			System.out.println(user);
			// 数据库中进行判断
			// 数据库中进行判断
			String sql = "select * from tb_user where user_name=? ";

			User new_user = qr.query(sql, new BeanHandler<User>(User.class), user.getUser_name());
			System.out.println("user=" + user);
			if (new_user != null) {    // 同名
				return "error";
			}
			
			String SQL = "insert into tb_user values(?,?,?,?,?,?,?,?)";
			qr = DBUtilTool.getQueryRunner();
			int res;
			res = qr.update(SQL, 1, user.getUser_name(), user.getUser_pwd(),user.getSex(),user.getEducation(),
					user.getProfession(),user.getTele(),user.getEmail());

			System.out.println("res=" + res);
			if (res == 1) { // 注册成功
				return "success";
			} else if (res == -1) {
				return "error";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "error";

	}
	public String skip() {
		
		return "skip";
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

}
