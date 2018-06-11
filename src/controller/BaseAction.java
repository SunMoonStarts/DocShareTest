package controller;

import java.util.Map;

import javax.websocket.Session;

import org.apache.struts2.interceptor.SessionAware;

//获取到Struts中的保存着Session对象的map
public class BaseAction implements SessionAware {

//	private Map<String , Object>sessionMap;
	public Map<String , Object>sessionMap;
	
	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap=map;
	}

	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSessionMap(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
	
}
