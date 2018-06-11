package controller.mapper;

import java.util.List;

import modal.bean.Doc;
import modal.bean.SearchBean;
import modal.bean.User_Doc;

//文档相关的数据库操作
public interface DocMapper {

	public int addDoc(Doc doc);   //添加文档
	public List<Doc> findAllDoc();  //查找所有文档
	public List<Doc> findDoc(SearchBean search);  //查询文档
	public List<Doc> findDocByCondition(SearchBean search);  //模糊查询
	public List<Doc> findDocForCheck(SearchBean search); //文档审核的查询
	
	public int addUserDoc(User_Doc user_doc);  //记录 用户对文档的操作--审核完时记录
	
	public int updateDocState(int id);
}
