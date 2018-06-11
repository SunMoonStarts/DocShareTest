package modal.dao;

import org.apache.commons.dbutils.QueryRunner;

//dbutil工具类
public class DBUtilTool {

	private static QueryRunner qr = new QueryRunner(CPUtil.getDataSource());

	// 获取对象
	public static QueryRunner getQueryRunner() {

		return qr;

	}
}
