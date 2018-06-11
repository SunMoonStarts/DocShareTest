package controller.mapper;

import modal.bean.Integral;

//积分
public interface IntegralMapper {
	
	public int getIntegralByUsername(String user_name); //根据用户id查找积分
	public int addIntegral(Integral integral);  //增加记录--注册
	public int updateIntegral(Integral integral); //更新积分--增/减
	
}
