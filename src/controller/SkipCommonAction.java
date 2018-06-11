package controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

//统一跳转文档界面的
public class SkipCommonAction {
	
	private String page;   //当前页面

	public HttpServletRequest request; // request对象--通过底层Servlet调用
	String flag = "search-all-doc";
	String type;

	// 跳转
	public String skipPage() {
		request = ServletActionContext.getRequest();
		type = request.getParameter("type");
		System.out.println("type=" + type);
		switch (type) {
		// 全部文档的页面
		case "allDoc":
			flag = "search-all-doc";
			break;
		// 我的文档
		case "myDoc":
			flag = "my-doc";
			break;
		// 上传文档
		case "uploadDoc":
			flag = "up-load-doc";
			break;
		// 下载文档
		case "downloadDoc":
			flag = "down-load-doc";
			break;
		//文档审核
		case "docCheck":
			flag = "doc-admin-check";
			page="docMana";  
			break;
		case "userAdd": // 用户添加
			flag = "user-admin-add";
			break;
		case "register": // 注册
			flag = "user-register";
			break;
		case "exit": // 退出
			flag = "user-exit";
			break;
		default:
			break;
		}

		return flag;
	}
	//用户相关的跳转
	public String skipUser() {
		request = ServletActionContext.getRequest();
		type = request.getParameter("type");
		System.out.println("fdf"+type);
		switch(type) {
		case "userSelect": // 用户查询
			flag = "user-admin-select";
			break;
		case "userMana": // 用户管控
			flag = "user-admin-mana";
			page="userMana";  
			break;
		case "register": // 注册
			flag = "user-register";
			break;
		case "exit": // 退出
			flag = "user-exit";
			break;
		default:
			break;
		}
		return flag;
	}
	//服务端界面的跳转
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	
}
