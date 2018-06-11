package common.biz;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import controller.mapper.DocMapper;
import modal.bean.Doc;
import modal.bean.SearchBean;
import modal.bean.User_Doc;
import modal.common.MyBatisUtil;

//文档相关的业务
public class DocBizImpl implements DocBiz{

	SqlSession session;
	DocMapper docMapper;
	
	//上传新文档
	@Override
	public int uploadDoc(Doc doc) {
		
		session=MyBatisUtil.getSession();
		docMapper=session.getMapper(DocMapper.class);
		int res=docMapper.addDoc(doc);
		
		session.commit();
		session.close();
		
		return res;
	}

	//查找文档--带条件模糊查询，查找的是自己的文档
	@Override
	public List<Doc> findDoc(SearchBean search) {
		List<Doc> docList=new ArrayList();
		
		session=MyBatisUtil.getSession();
		docMapper=session.getMapper(DocMapper.class);
		docList=docMapper.findDoc(search);
		
		return docList;
	}
//无条件查找全部文档
	@Override
	public List<Doc> findAllDoc() {
		List<Doc> docList=new ArrayList();
		
		session=MyBatisUtil.getSession();
		docMapper=session.getMapper(DocMapper.class);
		docList=docMapper.findAllDoc();
		
		return docList;
	}

	//查询所有文档--根据条件模糊查询
	@Override
	public List<Doc> findDocByCondition(SearchBean search) {
		List<Doc> docList=new ArrayList();
		
		session=MyBatisUtil.getSession();
		docMapper=session.getMapper(DocMapper.class);
		System.out.println("search="+search);
		docList=docMapper.findDocByCondition(search);
		
		return docList;
	}
	//文档审核的页面查询--管理 端
	@Override
	public List<Doc> findDocForCheck(SearchBean search) {
		
		List<Doc> docList=new ArrayList();
		session=MyBatisUtil.getSession();
		docMapper=session.getMapper(DocMapper.class);
		docList=docMapper.findDocForCheck(search);
		
		return docList;
	}

	@Override
	public int docCheck(String state, int id) {
		
		session=MyBatisUtil.getSession();
		docMapper=session.getMapper(DocMapper.class);
		int res=docMapper.updateDocState(id);
		session.commit();
		session.close();
		
		return res;
	}
	
	//记录用户文档操作
	@Override
	public int recordUserDoc(User_Doc user_doc) {
		
		session=MyBatisUtil.getSession();
		docMapper=session.getMapper(DocMapper.class);
		int res=docMapper.addUserDoc(user_doc);	//添加记录
		session.commit();
		session.close();
		return res;
	}

}
