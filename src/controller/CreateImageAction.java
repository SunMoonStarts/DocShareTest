package controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import modal.common.ImageUtil;

//继承，使用父类的Session
public class CreateImageAction extends BaseAction{

	//验证码图片输入流
	private InputStream imageStream;
	private String tips;

	public String execute() {
		//创建验证码图片
		Map<String , BufferedImage>imageMap=ImageUtil.createImage();
		//取出验证码，放入session
		String code=imageMap.keySet().iterator().next();
		getSessionMap().put("imageCode", code);  //父类的变量
//		sessionMap.put("imageCode", code);
	//	System.out.println("getses"+getSessionMap());
		//取出图片
		BufferedImage image=imageMap.get(code); 
		//将图片转变为输入流
		try {
			imageStream=ImageUtil.getInputStream(image);
		} catch (IOException e) {
			e.printStackTrace();
			tips="验证码错误";
			return "error";
		}
		return "success";
	}
	public InputStream getImageStream() {
		return imageStream;
	}

	public void setImageStream(InputStream imageStream) {
		this.imageStream = imageStream;
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
}
