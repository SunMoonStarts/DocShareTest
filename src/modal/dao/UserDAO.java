package modal.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import modal.bean.User;

//用户对象的相关数据操作
public class UserDAO {

	QueryRunner qr = DBUtilTool.getQueryRunner();

	// 查找--根据用户名进行查找
	public User query(String username) {
		// select * from tb_user where user_name=? and user_pwd=?
		User user = null;
		try {
			String sql = "select * from tb_user where user_name=?";

			user=qr.query(sql, new BeanHandler<User>(User.class),username);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}
}
