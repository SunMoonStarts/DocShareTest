package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modal.bean.User;

public class TestAction {

	private User user;
	private Map<String,String>map;
	private List<String>list;
	
	public String execute(){
		
		user=new User("小马","男");
		map=new HashMap<String,String>();
		map.put("我是key", "我是值");
		map.put("我是key2", "我是值2");
		list=new ArrayList<String>();
		list.add("列表1");
		list.add("列表2");
		
		return "test";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
}
