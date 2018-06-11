package controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import common.biz.IntegralBiz;
import common.biz.IntegralBizImpl;
import common.biz.UserBizImpl;
import modal.bean.Integral;
import modal.bean.SearchBean;
import modal.bean.User;
import modal.common.ActionFlagUtil;
import modal.common.Util;

//用户相关操作---前端--userAction!login.action?type=member
public class UserAction extends BaseAction{

	private User user;
	private SearchBean search;  //查询条件
	private String vcode;
	
	String flag;
	HttpServletRequest request=ServletActionContext.getRequest();  //底层Servlet获取request对象
	UserBizImpl userBiz;
	
	//登录
	public String login() {
		String type=request.getParameter("type");
		userBiz=new UserBizImpl();
		switch (type) {
		case "member":{
		
			Object imageCode=sessionMap.get("imageCode"); 	//验证码
			//验证码输入错误---忽略大小写
			if( !(imageCode.toString().toLowerCase().equals(vcode.toLowerCase())) ) {
				flag="code-error";
				request.setAttribute("login", flag);
				return flag;  //登录失败，跳转登录页
			}
			int param_id=1;  //普通会员
			user.setParam_id(param_id);
			user=userBiz.login(user);
			flag=ActionFlagUtil.getLoginFlag(type,user);  //判断，返回结果
			
			request.setAttribute("login", flag);
			request.getSession().setAttribute("User", user);
			break;
		}
		case "admin":
			int param_id=2;  //系统管理员
			user.setParam_id(param_id);
			user=userBiz.login(user);
			flag=ActionFlagUtil.getLoginFlag(type,user);  
			request.setAttribute("login", flag);
			request.getSession().setAttribute("User", user);
			break;
		default:
			break;
		}
		return flag;
	}
	
	//注册
	public String register() {
		
		userBiz=new UserBizImpl();
		int param_id=1;  //前台会员用户
		user.setParam_id(param_id);
		user.setRegister_time(Util.getCurrentTime()); //注册时间
//		user.setIntegral(new BigDecimal("0")); //初始积分-- 0
		System.out.println(user);
		//积分表--初始化
		IntegralBiz ibiz=new IntegralBizImpl();
		Integral integral=new Integral(user.getUser_name(),0);  //初始化积分对象
		ibiz.addIntegral(integral);
		int res=userBiz.register(user);
		flag=ActionFlagUtil.getRegisterFlag(res); 
		request.setAttribute("registerFlag", flag);  //注册情况
		return flag;
	}
	
	//用户查询
	public String userSelection() {
		
		
		return flag;
	}
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public SearchBean getSearch() {
		return search;
	}

	public void setSearch(SearchBean search) {
		this.search = search;
	}

	public String getVcode() {
		return vcode;
	}
	public void setVcode(String vcode) {
		this.vcode = vcode;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}

}
