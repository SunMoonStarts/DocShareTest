package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.RowBounds;

import common.biz.DocBiz;
import common.biz.DocBizImpl;
import common.biz.UserBiz;
import common.biz.UserBizImpl;
import modal.bean.Doc;
import modal.bean.SearchBean;

//查询功能
public class SearchAction {

	private SearchBean search; //查询条件
	private List<Doc>docList; //文档列表
	private List<Doc>userInfoList; //用户相关信息
	
	HttpServletRequest request; // request对象--通过底层Servlet调用
	DocBiz docBiz;
	UserBiz userBiz;
	String flag;
	String page; //页面

	
	//用户查询--后台
	public String userSelection() {
		System.out.println("search="+search);
		userBiz=new UserBizImpl();
		//统计用户的相关信息
		
		
		return flag;
	}
	
	//分页
	public String skip() {
		
		
		
		
		return flag;
	}
	
	
	
	
	
	//文档审核页面查询显示
	public String docCheck() {
		docBiz=new DocBizImpl();
		docList=docBiz.findDocForCheck(search);
		
		flag="doc-check-search";
		page="docMana";
		return flag;
	}

	public SearchBean getSearch() {
		return search;
	}

	public void setSearch(SearchBean search) {
		this.search = search;
	}
	
	public List<Doc> getUserInfoList() {
		return userInfoList;
	}
	public void setUserInfoList(List<Doc> userInfoList) {
		this.userInfoList = userInfoList;
	}
	public List<Doc> getDocList() {
		return docList;
	}

	public void setDocList(List<Doc> docList) {
		this.docList = docList;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
}
