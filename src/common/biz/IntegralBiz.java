package common.biz;

import modal.bean.Integral;

public interface IntegralBiz {

	public int getUserIntegral(String user_name);  //查找指定用户的积分--根据用户名
	public int addIntegral(Integral integral);  //增加
	public int updateIntegral(Integral integral); //更新积分
	
}
