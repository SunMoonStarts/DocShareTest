package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controller.mapper.DocMapper;
import controller.mapper.UserMapper;
import modal.bean.Doc;
import modal.bean.Integral;
import modal.bean.User;
import modal.common.MyBatisUtil;

public class TestSql {

	@Test
	public void testInsert() {
		
		SqlSession session=MyBatisUtil.getSession();
		UserMapper userMap = session.getMapper(UserMapper.class);
		User user=new User("小懵6","女");
		int res=userMap.addUser(user);
		System.out.println("res="+res);
		session.commit();
	}
	@Test 
	public void testDocCon() {
		SqlSession session=MyBatisUtil.getSession();
		DocMapper userMap = session.getMapper(DocMapper.class);
		String condition="ppt";
//		List<Doc>list=userMap.findDocByCondition(condition);
//		System.out.println(list.size());
	}
	@Test
	public void testSpring() {
		
		String path="applicationContext.xml";
		ApplicationContext conf=new ClassPathXmlApplicationContext(path);
		
		User user=(User) conf.getBean("user");
		System.out.println(user);
		AbstractXmlApplicationContext ad=(AbstractXmlApplicationContext) conf;
		ad.close();
		
	}
	@Test
	public void testSpring2() {
		String path="applicationContext.xml";
		ApplicationContext conf=new ClassPathXmlApplicationContext(path);
		
		Integral it=(Integral) conf.getBean("integral");
		System.out.println(it);
		
		AbstractApplicationContext ab=(AbstractApplicationContext) conf;
		ab.close();
	}
	
	
}
