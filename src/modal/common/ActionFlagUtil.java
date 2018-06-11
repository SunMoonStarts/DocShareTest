package modal.common;

import common.biz.UserBizImpl;
import modal.bean.User;

//统一处理,判断返回的flag
public class ActionFlagUtil {

	//登录
	public static String getLoginFlag(String type, User user) {
		
		String flag = null;
		switch(type) {
		case "member":  //普通会员登录
			if(user!=null) {
				flag="login-member-success";
			}else {
				flag="login-member-fail";
			}
			
			break;
		case "admin"://管理员--后台
			if(user!=null) {
				flag="login-admin-success";
				
			}else {
				flag="login-admin-fail";
			}
			break;
		default:break;
		
		}
		return flag;
	}

	//注册
	public static String getRegisterFlag(int res) {
		String flag = null;
		switch(res) {
		case 0:
			flag="register-insert-error";  //插入数据错误
			break;
		case 1:
			flag="register-success";
			break;
		case 2:
			flag="register-same-error";
			break;
		default:break;
		}
		return flag;
	}
	
}
