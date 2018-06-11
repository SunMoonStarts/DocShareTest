package modal.common;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	
	private static SqlSessionFactory sf;

	static {
		// 加载配置文件
		String conf = "SqlMapConfig.xml";
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(conf);
			SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
			sf = sfb.build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 创建连接
	 */
	public static SqlSession getSession() {
		return sf.openSession();
	}
	

	public static void main(String[] args) {
		System.out.println("MyBatisUtil.getSession()"+MyBatisUtil.getSession());
		SqlSession session = MyBatisUtil.getSession();
		System.out.println(session);
		session.close();
	}

}
