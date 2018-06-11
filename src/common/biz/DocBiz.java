package common.biz;

import java.util.List;

import modal.bean.Doc;
import modal.bean.SearchBean;
import modal.bean.User_Doc;

//文档业务
public interface DocBiz {

	public int uploadDoc(Doc doc);
	public List<Doc> findDoc(SearchBean search);
	public List<Doc> findAllDoc();
	public List<Doc> findDocByCondition(SearchBean search);  //模糊查询
	public List<Doc> findDocForCheck(SearchBean search); //文档审核的查询
	public int docCheck(String state,int id); //文档审核--审核状态/id
	
	public int recordUserDoc(User_Doc user_doc);//记录用户对文档的操作--上传、下载
}
