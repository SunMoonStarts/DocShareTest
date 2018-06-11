package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import common.biz.DocBiz;
import common.biz.DocBizImpl;
import modal.bean.Doc;
import modal.bean.User;
import modal.common.Util;

//多文件上传
public class UploadAction extends ActionSupport {

	// 单个文件上传和固定数量文件上传，只有在action中略有不同，单个文件的file,filename,filecontenttype都是单值，
	// 而固定数量文件的这三个值均为多值，即可采用list或数组的方式来接收，然后遍历集合或数组进行文件运读写
	// 操作即可，但页面上的几个file控件的name要相同

	private List<File> myfile; // 对应页面的file控件的name
	private List<String> myfileFileName; // 对应上传的文件名，命名方式：myfile(对应页面上的file控件的name)+FileName（固定）
	private List<String> myfileContentType;// 对应上传的文件类型，命名方式：myfile(对应页面上的file控件的name)+ContentType（固定）

	private Doc doc;
	private String desc;  //简介
	
	String root="F:\\JAVA\\workspace\\DocSSTest3\\WebContent\\upload"; 
	HttpServletRequest request=ServletActionContext.getRequest();  //底层Servlet获取request对象
	DocBiz docBiz;
	
	
	@SuppressWarnings("deprecation")
	public String execute() throws Exception {
		
//		System.out.println("没加都可能不能运行");
		docBiz=new DocBizImpl();
		User user=(User) request.getSession().getAttribute("User");
		
		for (int i = 0; i < this.getMyfile().size(); i++) {

			InputStream is = new FileInputStream(this.getMyfile().get(i)); // 构建输入流

//			String root = ServletActionContext.getRequest().getRealPath("/upload"); // 设置文件上传的路径
			System.out.println("root="+root);
			File destFile = new File(root, this.getMyfileFileName().get(i));// 构建文件
			// root:上传路径，this.getMyfileFileName():上传后生成的文件名
			System.out.println("destf"+destFile);
			OutputStream os = new FileOutputStream(destFile); // 构建输出流

			byte[] buffer = new byte[400]; // 以下为读写文件操作

			int length = 0;

			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
			is.close();
			os.close();
		}
		String fname = "文档名";
		String type="txt";
		for(int i=0;i<myfileFileName.size();i++) {
			fname=myfileFileName.get(0);
			type=fname.substring(fname.indexOf(".")+1); //后缀
		}
		doc.setDoc_name(fname);  //物理文件名
		doc.setUploader(user.getUser_name());
		doc.setUpload_time(Util.getCurrentTime());
		doc.setDown_count(0); //下载次数
		doc.setDoc_type(type);  //第一个文件
		doc.setState("未审核");
		int res=docBiz.uploadDoc(doc);
		System.out.println("res="+res);
		return "result";
		
	}

	
	
	public Doc getDoc() {
		return doc;
	}
	public void setDoc(Doc doc) {
		this.doc = doc;
	}
	public List<File> getMyfile() {
		return myfile;
	}

	public void setMyfile(List<File> myfile) {
		this.myfile = myfile;
	}

	public List<String> getMyfileFileName() {
		return myfileFileName;
	}

	public void setMyfileFileName(List<String> myfileFileName) {
		this.myfileFileName = myfileFileName;
	}

	public List<String> getMyfileContentType() {
		return myfileContentType;
	}

	public void setMyfileContentType(List<String> myfileContentType) {
		this.myfileContentType = myfileContentType;
	}

}
