package controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

//统一跳转文档界面的
public class SkipCommonAction {

	public HttpServletRequest request; // request对象--通过底层Servlet调用
	String flag = "search-all-doc";
	String type;

	/*// 首页的搜索所有文档界面
	public String skipSearchAllDoc() {

		request = ServletActionContext.getRequest();
		
		
		flag = "search-all-doc";
		return flag;
	}

	// 我的文档
	public String skipMyDoc() {

		flag = "my-doc";

		return flag;
	}

	// 上传文档
	public String skipUpDoc() {

		flag = "up-load-doc";

		return flag;
	}*/
	
	//跳转
	public String skipPage() {
		request = ServletActionContext.getRequest();
		type = request.getParameter("type");
		System.out.println("type="+type);
		switch (type) {
		//全部文档的页面
		case "allDoc":
			flag = "search-all-doc";
			break;
		//我的文档
		case "myDoc":
			flag = "my-doc";
			break;
		//上传文档
		case "uploadDoc":
			flag = "up-load-doc";
			break;
		case "userAdd":  //用户添加

			flag = "user-admin-add";
			break;
		
		default:
			break;
		}

		return flag;
		
	}
	
	/*// 用户添加
	public String skipUserAdd() {
		request = ServletActionContext.getRequest();
		type = request.getParameter("type");
		System.out.println("type="+type);
		switch (type) {
		case "userAdd":  //用户添加

			flag = "user-admin-add";
			break;
			
		default:
			break;
		}

		return flag;
	}*/

}
