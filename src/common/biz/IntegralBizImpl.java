package common.biz;

import org.apache.ibatis.session.SqlSession;

import controller.mapper.IntegralMapper;
import modal.bean.Integral;
import modal.common.MyBatisUtil;

//涉及积分相关的业务
public class IntegralBizImpl implements IntegralBiz {

	SqlSession session;
	IntegralMapper inteMapper;
	
	//返回用户积分--根据用户名
	@Override
	public int getUserIntegral(String user_name) {
		
		session=MyBatisUtil.getSession();
		inteMapper=session.getMapper(IntegralMapper.class);
		int integral=inteMapper.getIntegralByUsername(user_name);
		
		return integral;
	}
	
//增加积分
	@Override
	public int addIntegral(Integral integral) {
		session=MyBatisUtil.getSession();
		inteMapper=session.getMapper(IntegralMapper.class);
				
		int res=inteMapper.addIntegral(integral);
		session.commit();
		session.close();
		
		return res;
	}
//更新积分
	@Override
	public int updateIntegral(Integral integral) {
		session=MyBatisUtil.getSession();
		inteMapper=session.getMapper(IntegralMapper.class);
		int res=inteMapper.updateIntegral(integral);
		
		session.commit();
		session.close();
		return res;
	}
	

}
