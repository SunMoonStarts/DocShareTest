package controller;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import modal.common.MyBatisUtil;

public class DownloadAction extends ActionSupport {

	private String fname;   //request 中的值

	String root = "";

	public InputStream getDownloadFile() {
		
		System.out.println("fname="+fname);
		if(fname==null) {
			fname="test.ppt";
		}
		
		return ServletActionContext.getServletContext().getResourceAsStream("/upload/"+fname);
	}

	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	

}
