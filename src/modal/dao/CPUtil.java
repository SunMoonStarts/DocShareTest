package modal.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;



public class CPUtil {

	// 使用命名配置
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource("myc3p0");

	// 获取连接池
	public static DataSource getDataSource() {
		return dataSource;

	}

	// 获取连接
	public static Connection getConnection() {

		try {

			return dataSource.getConnection();

		} catch (SQLException e) {
			throw new RuntimeException();
		}

	}
}
