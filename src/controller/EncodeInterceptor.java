package controller;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

//拦截器
public class EncodeInterceptor implements Interceptor{

	//销毁
	@Override
	public void destroy() {
		
	}

	//初始化
	@Override
	public void init() {
		
		System.out.println("init...");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("intercept");
		ai.invoke();
		System.out.println("拦截后...");
		return null;
	}

}
