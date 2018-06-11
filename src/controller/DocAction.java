package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import common.biz.DocBiz;
import common.biz.DocBizImpl;
import common.biz.IntegralBiz;
import common.biz.IntegralBizImpl;
import modal.bean.Doc;
import modal.bean.Integral;
import modal.bean.SearchBean;
import modal.bean.User;
import modal.bean.User_Doc;

//文档相关
public class DocAction {

	private SearchBean search; //查询条件
	private List<Doc>docList;
	
	HttpServletRequest request=ServletActionContext.getRequest();  //底层Servlet获取request对象
	DocBiz docBiz=new DocBizImpl();
	IntegralBiz inteBiz=new IntegralBizImpl();
	User user;
	String flag;
	
	//我的文档查询
	public String myDocSearch() {
		
		user=(User)request.getSession().getAttribute("User");
		String name=user.getUser_name();  //上传者
		search.setUploader(name);
		docBiz=new DocBizImpl();
		docList=docBiz.findDoc(search);
		flag="search-my-doc";
		return flag;
		
	}
	//查找全部文档--根据条件
	public String allDocSearch() {
		docBiz=new DocBizImpl();
		docList=docBiz.findDocByCondition(search);
		
		flag="search-all-doc";
		return flag;
	}
	//审核文档--通过
	public String checkDoc() {
	
		String uploader=request.getParameter("uploader");
		int id=Integer.parseInt(request.getParameter("id"));  //doc_id
		String docType=request.getParameter("docType");
		String check=request.getParameter("check");
		int res=docBiz.docCheck(check, id);//审核文档
		//查找当前用户的积分、该类型文档的增加的积分、增加用户积分
		int inte=inteBiz.getUserIntegral(uploader);//
		Integral integral=new Integral();
		integral.setUser_name(uploader);
		int total_integral=inte+10;   //上传+10分，未分类型
		integral.setTotal_integral(total_integral);
		inteBiz.updateIntegral(integral);  //增加积分
		//记录用户对文档的操作
		User_Doc user_doc=new User_Doc(uploader,id,"上传");
		docBiz.recordUserDoc(user_doc);
		flag="success";
		return flag;
	}
	
	
	public List<Doc> getDocList() {
		return docList;
	}
	public void setDocList(List<Doc> docList) {
		this.docList = docList;
	}

	public SearchBean getSearch() {
		return search;
	}
	public void setSearch(SearchBean search) {
		this.search = search;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	
}
